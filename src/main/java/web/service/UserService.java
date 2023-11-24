package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void updUser(User user);
    void delUser(int id);

    List<User> listUsers();
    User findUser(int id);

}
