package jersey.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by wangmo on 16/9/22.
 */
@Path("/hello")
public class HelloWorldResource {

    @Path("/world")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void hello() {
        System.out.println("hello world");
    }
}
