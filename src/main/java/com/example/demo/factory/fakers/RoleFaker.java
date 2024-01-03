package com.example.demo.factory.fakers;

import com.example.demo.entity.Permission;
import com.example.demo.entity.Role;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoleFaker {
    private final Faker faker = new Faker();

    public Role makeRole(List<Permission> permissions, String name) {
        return Role.builder()
                .roleName(name)
                .description(faker.lorem().sentence())
                .permissions(permissions)
                .build();
    }
}
