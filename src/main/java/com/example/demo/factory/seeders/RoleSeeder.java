package com.example.demo.factory.seeders;

import com.example.demo.entity.Permission;
import com.example.demo.entity.Role;
import com.example.demo.factory.fakers.RoleFaker;
import com.example.demo.repository.PermissionRepository;
import com.example.demo.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class RoleSeeder {
    private final RoleRepository roleRepository;
    private final PermissionRepository permissionRepository;
    private final RoleFaker roleFaker;

    public void seed() {
        List<Permission> permissions = permissionRepository.findAll();
        Role role = roleFaker.makeRole(permissions, "ADMIN");
        roleRepository.save(role);

        Role role1 = roleFaker.makeRole(permissions, "USER");
        roleRepository.save(role1);
    }
}
