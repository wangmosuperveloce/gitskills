package jersey.service;

import jersey.dao.UserDao;
import jersey.model.User;

import java.util.List;

/**
 * Created by wangmo on 16/9/22.
 */
public class UserService {

    public static User  getUserById(String id) {

        return UserDao.getUserById(id);
    }

    public  static List<User> getUsers() {

        return UserDao.getUsers();
    }

    public static void delUserById(String id) {
        UserDao.delUserById(id);
    }



    public static void addUser(User user) {

        UserDao.addUser(user);
    }

    public static void updateUser(User user) {

        UserDao.updateUser(user);
    }

}
