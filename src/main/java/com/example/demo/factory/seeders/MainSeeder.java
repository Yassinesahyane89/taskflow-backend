package com.example.demo.factory.seeders;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MainSeeder implements CommandLineRunner{
    private final PermissionSeeder permissionSeeder;
    private final RoleSeeder roleSeeder;
    @Override
    public void run(String... args) throws Exception {
        permissionSeeder.seed();
        roleSeeder.seed();
    }
}