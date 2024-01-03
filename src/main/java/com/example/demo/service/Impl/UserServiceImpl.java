package com.example.demo.service.Impl;

import com.example.demo.entity.User;
import com.example.demo.exception.PasswordConfirmationException;
import com.example.demo.exception.PasswordUnchangedException;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user, Principal principal) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public void changePassword(Long userId, String newPassword, String confirmNewPassword) {
        User user = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User not found"));

        // Check if the new password and the confirm new password are the same
        if (!newPassword.equals(confirmNewPassword)) {
            throw new PasswordConfirmationException("New password and confirm new password are not the same");
        }

        // Check if the new password is the same as the current password
        if (passwordEncoder.matches(newPassword, user.getPassword())) {
            throw new PasswordUnchangedException("New password must be different from the current password");
        }

        // Encode the new password and save it
        user.setPassword(passwordEncoder.encode(newPassword));

        userRepository.save(user);
    }

    @Override
    public List<User> searchUsers(String keyword) {
        return null;
    }

    @Override
    public User deleteUser(Principal principal) {
        return null;
    }
}
