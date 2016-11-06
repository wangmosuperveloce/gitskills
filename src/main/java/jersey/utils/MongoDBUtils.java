package jersey.utils;

import com.mongodb.MongoClient;
import jersey.model.User;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangmo on 16/9/22.
 */

public class MongoDBUtils {

//    public static Mongo mongo = null;
    private static Morphia morphia;
    private static Datastore datastore;

    static {
        morphia = new Morphia();
        morphia.mapPackage("jersey.model");
        datastore = morphia.createDatastore(new MongoClient("localhost",27017), "jersey");
    }

//    public static DB db = null;
//    private static String dbName = "UserAdmin";
//    private static String mongodbServerAddress = "127.0.0.1:27017";
    private static String colName = "User";

    public static User findUserByID(String id) {
        System.out.println("wangmo findUserById...");
        List<User> users = datastore.createQuery(User.class).field("id").equal(id).limit(1).asList();
        if (users.size() > 0) {
            return users.get(0);
        }
        return new User();
    }

    public static List<User>  findUsers() {
        System.out.println("wangmo find users...");

        List<User> users = datastore.createQuery(User.class).asList();
        if (users.size() > 0) {
            return users;
        }
        return new ArrayList<>();
    }

    public static void removeByID(String value) {
        System.out.println("wangmo remove by id...");

        Query<User> users = datastore.createQuery(User.class).filter("id",value);
        datastore.delete(users);
    }

    public static void insertUserData(User user) {
        System.out.println("wangmo insert..."+user);

        datastore.save(user);
    }

    public static void updateByUser(User user) {
        System.out.println("wangmo update..."+user);

        Query<User> query = datastore.createQuery(User.class).filter("id",user.getId());
        datastore.updateFirst(query,user,true);
    }

    public static void close() {
        System.out.println("wangmo nothing to do...");
    }
}