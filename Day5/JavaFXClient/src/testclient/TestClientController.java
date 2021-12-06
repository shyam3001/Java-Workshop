package testclient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class TestClientController implements Runnable {

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
            new Thread(this).start();
        });
    }

    @Override
    public void run() {
        try {
            String uri = "http://localhost:8080/HelloRestService/webresources/helloWorld/myWorld";
            HttpClient httpClient = HttpClient.newBuilder().build();
            HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(uri)).build();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            HttpHeaders headers = response.headers();
            Platform.runLater(() -> {
                label.setText(response.body());
            });
        } catch (Exception ex) {
            Platform.runLater(() -> {
                label.setText(ex.toString());
            });
        }
    }
}
