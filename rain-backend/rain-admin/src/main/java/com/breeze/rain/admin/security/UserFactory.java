package com.breeze.rain.admin.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserFactory {

    public static User create(String username, String password, List<String> roles) {
        String[] roleArr = new String[roles.size()];
        User user = new User(username, password, AuthorityUtils.createAuthorityList(roles.toArray(roleArr)));
        return user;
    }

}
