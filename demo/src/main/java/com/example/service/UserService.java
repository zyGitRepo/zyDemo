package com.example.service;

import com.example.domain.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @version [版本号, ]
 * @Author: zy
 * @Description:
 * @Date: Created in 2018/7/4 21:57.
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Service
@Transactional  //事务处理
public class UserService {

    @Autowired
    private UserMapper mapper;

    @Transactional(readOnly = true) //给查询方法加只读事务
    public List<User> queryAll() throws Exception {
        return mapper.queryAll();
    }

    public int addUser(User user) throws Exception {
        int i = mapper.addUser(user);
        return i;
    }
}
