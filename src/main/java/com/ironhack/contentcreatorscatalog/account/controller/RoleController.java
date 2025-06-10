package com.ironhack.contentcreatorscatalog.account.controller;


import com.ironhack.contentcreatorscatalog.account.dto.RoleToUserDTO;
import com.ironhack.contentcreatorscatalog.account.model.Role;
import com.ironhack.contentcreatorscatalog.security.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService roleService;

    @PostMapping("/roles")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveRole(@RequestBody Role role) {
        roleService.save(role);
    }

    @PostMapping("/roles/add-to-user")
    @ResponseStatus(HttpStatus.OK)
    public void addRoleToUser(@RequestBody RoleToUserDTO roleToUserDTO) {
        roleService.addRoleToUser(roleToUserDTO.getUsername(), roleToUserDTO.getRoleName());
    }
}