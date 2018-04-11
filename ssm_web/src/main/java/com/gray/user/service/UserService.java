package com.gray.user.service;

import com.gray.user.dao.UserMapper;
import com.gray.user.entity.User;

/**
 * Created by admin on 2017/7/20.
 */
public interface UserService {
    UserMapper getMapper();

    boolean doUserLogin(User user);
}
