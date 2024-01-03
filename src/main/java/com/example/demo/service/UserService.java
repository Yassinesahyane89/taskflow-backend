package com.example.demo.service;

import com.example.demo.entity.User;

import java.security.Principal;
import java.util.List;

public interface UserService {
    User getUserById(Long userId);
    List<User> getAllUsers();
    User updateUser(User user, Long userId);
    User getUserByEmail(String email);
    public void changePassword(Long userId, String newPassword, String confirmNewPassword);
    List<User> searchUsers(String keyword);
    void deleteUser(Long userId);
}
