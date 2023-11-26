package com.youtube.firstProject.service;

import java.util.List;
import java.util.Optional;

import com.youtube.firstProject.model.User;

public interface UserService {
    public User addUser(User user);

    public void deleteUser(int id);

    public List<User> getAllSignup();

    // Optional<User>getuserData(int id);
    // boolean isexitUserbyemail(String email);
    // User updateUserByEmail(String email,User updatedUser);

}
