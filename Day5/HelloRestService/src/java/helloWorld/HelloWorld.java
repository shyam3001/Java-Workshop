package helloWorld;

import java.util.Calendar;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("helloWorld")
public class HelloWorld {
    @Context
    private UriInfo context;

    public HelloWorld() {
    }
    
    @GET
    @Path("myWorld")
    @Produces(MediaType.TEXT_HTML)
    public String getMyHtml() {
        return "<html><body>Hello World - This is my time: "+Calendar.getInstance().getTime()+"</body></html>";
    }

    @GET
    @Path("myWorld/{a}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getMyInnerHtml(@PathParam("a")String a) {
        System.out.println("inside getMyInnerHTML");
        return "This is my inner time: "+Calendar.getInstance().getTime()+" >>>> " + a;
    }
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHtml() {
        return "<html><body>Hello World - Server Time is "+Calendar.getInstance().getTime()+"</body></html>";
    }

    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
        // do a put operation
    }
}
