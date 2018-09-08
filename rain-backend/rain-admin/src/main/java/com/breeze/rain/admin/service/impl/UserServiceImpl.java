package com.breeze.rain.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.breeze.rain.admin.dao.UserMapper;
import com.breeze.rain.admin.model.User;
import com.breeze.rain.admin.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
