package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    List<User> listUsers();

    User findUser(int id);
}
