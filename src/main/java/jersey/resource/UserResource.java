package jersey.resource;

/**
 * Created by wangmo on 16/9/22.
 */


import jersey.model.User;
import jersey.service.UserService;

import javax.inject.Singleton;
import javax.ws.rs.*;
import java.util.List;

@Singleton
@Path("/users")
public class UserResource {

    @GET
    @Produces({ "application/json", "application/xml" })
    public List<User> getMyResources() {
        List<User> users = UserService.getUsers();
        return users;
    }

    @GET
    @Path("/list")
    @Produces({ "application/json", "application/xml" })
    public List<User> getListOfUsers() {
        List<User> users = UserService.getUsers();
        return users;
    }

    @GET
    @Path("/{id}")
    @Produces({ "application/json" })
    public User getUser(@PathParam("id") String id) {
        User u=UserService.getUserById(id);
        return u;
    }

    @PUT
    //@Path("/ids/{id}")
    @Consumes({ "application/json", "application/xml" })
    public void putUser(User user) {

        UserService.updateUser(user);

    }
    @POST
    //@Path("/ids/{id}")
    @Consumes({ "application/json", "application/xml" })
    public void postUser(User user) {

        UserService.addUser(user);

    }
    @DELETE
    @Path("/{id}")
    public void deleteUser(@PathParam("id") String id) {
        UserService.delUserById(id);
    }

}