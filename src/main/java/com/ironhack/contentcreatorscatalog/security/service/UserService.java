package com.ironhack.contentcreatorscatalog.security.service;

import com.ironhack.contentcreatorscatalog.account.model.User;

import java.util.List;

public interface UserService {


    User saveUser(User user);

    User getUser(String username);


    List<User> getUsers();
}