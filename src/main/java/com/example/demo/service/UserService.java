package com.example.demo.service;

import com.example.demo.entity.User;

import java.security.Principal;
import java.util.List;

public interface UserService {
    User saveUser(User user);
    User updateUser(User user, Principal principal);
    User getUserByEmail(String email);
    public void changePassword(Long userId, String newPassword, String confirmNewPassword);
    List<User> searchUsers(String keyword);
    User deleteUser(Principal principal);
}
