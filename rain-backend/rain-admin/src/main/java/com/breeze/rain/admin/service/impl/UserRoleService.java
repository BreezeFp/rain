package com.breeze.rain.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.breeze.rain.admin.dao.UserRoleMapper;
import com.breeze.rain.admin.model.UserRole;
import com.breeze.rain.admin.service.IUserRoleService;
import org.springframework.stereotype.Service;

@Service
public class UserRoleService extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {
}
