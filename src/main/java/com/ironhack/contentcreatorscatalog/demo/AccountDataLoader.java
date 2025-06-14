package com.ironhack.contentcreatorscatalog.demo;

import com.github.javafaker.Faker;
import com.ironhack.contentcreatorscatalog.account.model.Role;
import com.ironhack.contentcreatorscatalog.account.model.User;
import com.ironhack.contentcreatorscatalog.security.service.RoleService;
import com.ironhack.contentcreatorscatalog.security.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountDataLoader implements CommandLineRunner {

    private final UserService userService;
    private final RoleService roleService;
    private final Faker faker = new Faker();

    @Override
    public void run(String... args) throws Exception {
        // Create roles
        roleService.save(new Role("ROLE_USER"));
        roleService.save(new Role("ROLE_ADMIN"));

        // Create and save users
        for (int i = 0; i < 4; i++) {
            String fullName = faker.name().fullName();
            String username = "user" + i;
            String password = "1234";

            userService.saveUser(new User(fullName, username, password));

            // Assign roles randomly
            if (i % 2 == 0) {
                roleService.addRoleToUser(username, "ROLE_USER");
            } else {
                roleService.addRoleToUser(username, "ROLE_ADMIN");
            }

            // Optional: give some users both roles
            if (i == 3) {
                roleService.addRoleToUser(username, "ROLE_USER");
            }
        }
    }
}
