package com.velora_ai.config;


import com.velora_ai.entity.Role;
import com.velora_ai.enums.RoleType;
import com.velora_ai.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final RoleRepository roleRepository;

    @Override
    public void run(String... args) {
        createRoleIfNotExists(RoleType.USER);
        createRoleIfNotExists(RoleType.ADMIN);
        createRoleIfNotExists(RoleType.RECRUITER);

    }

    private void createRoleIfNotExists(RoleType roleType) {

        if (!roleRepository.existsByName(roleType)) {

            Role role = new Role();
            role.setName(roleType);

            roleRepository.save(role);
        }
    }
}
