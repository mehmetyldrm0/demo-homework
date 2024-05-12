package toki.demo.service;

import toki.demo.entity.User;

public interface UserService {
    boolean authenticateUser(String username, String password);

    User saveUserService(User newUser);
}
