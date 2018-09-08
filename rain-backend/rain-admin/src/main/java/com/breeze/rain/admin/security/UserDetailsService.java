package com.breeze.rain.admin.security;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.breeze.rain.admin.model.Role;
import com.breeze.rain.admin.model.User;
import com.breeze.rain.admin.model.UserRole;
import com.breeze.rain.admin.service.IRoleService;
import com.breeze.rain.admin.service.IUserRoleService;
import com.breeze.rain.admin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    private IUserService userService;
    @Autowired
    private IUserRoleService userRoleService;
    @Autowired
    private IRoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userService.getOne(new QueryWrapper<User>().eq("username", username));
        List<UserRole> userRoles = userRoleService.list(new QueryWrapper<UserRole>().eq("user_id", user.getId()));
        List<Role> roles = roleService.list(new QueryWrapper<Role>().in("id", userRoles.stream().map(UserRole::getRoleId).collect(Collectors.toList())));
        List<String> roleNames = roles.stream().map(Role::getRole).collect(Collectors.toList());
        return UserFactory.create(user.getUsername(), user.getPassword(), roleNames);
    }
}
