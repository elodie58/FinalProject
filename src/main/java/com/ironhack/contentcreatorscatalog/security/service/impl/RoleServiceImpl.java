package com.ironhack.contentcreatorscatalog.security.service.impl;

import com.ironhack.contentcreatorscatalog.account.model.Role;
import com.ironhack.contentcreatorscatalog.account.model.User;
import com.ironhack.contentcreatorscatalog.account.repository.RoleRepository;
import com.ironhack.contentcreatorscatalog.account.repository.UserRepository;
import com.ironhack.contentcreatorscatalog.security.service.RoleService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RoleServiceImpl implements RoleService {


    private final UserRepository userRepository;


    private final RoleRepository roleRepository;


    @Override
    public Role save(Role role) {
        log.info("Saving new role {} to the database", role.getName());
        return roleRepository.save(role);
    }


    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Adding role {} to user {}", roleName, username);

        User user = userRepository.findFirstByUsername(username)
                .orElseThrow(() -> new EntityNotFoundException("User not found: " + username));

        Role role = roleRepository.findFirstByName(roleName)
                .orElseThrow(() -> new EntityNotFoundException("Role not found: " + roleName));

        user.getRoles().add(role);
        userRepository.save(user);
    }
}