package com.breeze.rain.mapper;

import com.breeze.rain.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author : fupeng
 * @since : 2018/7/30 14:29
 */
public interface UserMapper{

    /**
     * 根据 username 获取用户及其角色
     * @param username
     * @return
     */
    User selectOneWithRoleByUsername(@Param("username") String username);

}
