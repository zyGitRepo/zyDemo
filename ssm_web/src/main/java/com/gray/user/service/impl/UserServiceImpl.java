package com.gray.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gray.user.dao.UserMapper;
import com.gray.user.entity.User;
import com.gray.user.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper<User> mapper;

    public UserMapper getMapper() {
        return mapper;
    }

    public boolean doUserLogin(User user) {
        List<User> list = mapper.selectId(user.getUsername());
        if(list.size() == 0){
            return false;
        }else{
            if(list.get(0).getPassword().equals(user.getPassword())){
                return true;
            }else{
                return false;
            }
        }
    }
}
