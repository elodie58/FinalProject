package com.ironhack.contentcreatorscatalog.security.service;


import com.ironhack.contentcreatorscatalog.account.model.Role;

public interface RoleService {


    Role save(Role role);


    void addRoleToUser(String username, String roleName);
}