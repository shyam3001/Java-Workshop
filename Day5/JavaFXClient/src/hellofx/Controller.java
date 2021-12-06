package hellofx;

import java.io.StringReader;
import java.io.StringWriter;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.net.*;
import java.net.http.*;
import java.util.HashMap;
import java.util.Map;
import javafx.application.Platform;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonWriter;
import javax.json.JsonWriterFactory;
import javax.json.stream.JsonGenerator;

public class Controller implements Runnable {

    String city;
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private TextField textfield;

    public void initialize() {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        label.setText("Hello, JavaFX " + javafxVersion + "\nRunning on Java " + javaVersion + ".");
        button.setOnAction(e -> {
            label.setText("Loading...");
            city = textfield.getText();
            new Thread(this).start();
        });
    }

    private String format(String jsonString) throws Exception {
        StringWriter sw = new StringWriter();
        JsonReader jsonReader = Json.createReader(new StringReader(jsonString));
        JsonObject jsonObj = jsonReader.readObject();
        Map<String, Object> map = new HashMap<>();
        map.put(JsonGenerator.PRETTY_PRINTING, true);
        JsonWriterFactory writerFactory = Json.createWriterFactory(map);
        JsonWriter jsonWriter = writerFactory.createWriter(sw);
        jsonWriter.writeObject(jsonObj);
        jsonWriter.close();
        return sw.toString();
    }

    @Override
    public void run() {
        try {
            String uri = "http://api.weatherapi.com/v1/current.json?key=ab6e9c41a0c845af94052449210412&aqi=no&q="+city;
            HttpClient httpClient = HttpClient.newBuilder().build();
            HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(uri)).build();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            HttpHeaders headers = response.headers();
            headers.map().forEach((k, v) -> System.out.println(k + ":" + v));
            String result = format(response.body());
            Platform.runLater(() -> {
                label.setText(result);
            });
        } catch (Exception ex) {
            Platform.runLater(() -> {
                label.setText(ex.toString());
            });
        }
    }
}
