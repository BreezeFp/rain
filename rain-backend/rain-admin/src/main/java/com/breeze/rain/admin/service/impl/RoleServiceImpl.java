package com.breeze.rain.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.breeze.rain.admin.dao.RoleMapper;
import com.breeze.rain.admin.model.Role;
import com.breeze.rain.admin.service.IRoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {
}
