package com.velora_ai.repository;

import com.velora_ai.entity.Role;
import com.velora_ai.enums.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface RoleRepository extends JpaRepository<Role, UUID> {

    Optional<Role> findByName(RoleType name);
    boolean existsByName(RoleType name);
}
