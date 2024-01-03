package com.example.demo.factory.seeders;

import com.example.demo.entity.Permission;
import com.example.demo.enums.PermissionEnum;
import com.example.demo.repository.PermissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class PermissionSeeder {
    private final PermissionRepository permissionRepository;
    public void seed() {
        List<Permission> permissions = new ArrayList<>();
        for(PermissionEnum permission: PermissionEnum.values()) {
            permissions.add(
                    Permission.builder()
                            .permissionName(permission)
                            .build()
            );
        }
        permissionRepository.saveAll(permissions);
    }
}
