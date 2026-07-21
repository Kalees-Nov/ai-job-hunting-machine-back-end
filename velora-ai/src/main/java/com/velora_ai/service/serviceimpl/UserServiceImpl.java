package com.velora_ai.service.serviceimpl;

import com.velora_ai.entity.Role;
import com.velora_ai.entity.User;
import com.velora_ai.enums.RoleType;
import com.velora_ai.exception.ResourceNotFoundException;
import com.velora_ai.exception.UserNotFoundException;
import com.velora_ai.repository.RoleRepository;
import com.velora_ai.repository.UserRepository;
import com.velora_ai.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    @Transactional
    public void updateUserRole(UUID userId, RoleType roleType) {

        User user = userRepository.findById(userId)
                .orElseThrow(() ->
                        new UserNotFoundException("User not found"));

        Role role = roleRepository.findByName(roleType)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Role not found"));

        Set<Role> roles = new HashSet<>();
        roles.add(role);

        user.setRoles(roles);
        userRepository.save(user);
    }


}
