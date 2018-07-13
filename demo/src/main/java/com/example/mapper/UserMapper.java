package com.example.mapper;

import com.example.domain.User;
import org.springframework.stereotype.Service;

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
public interface UserMapper {

    List<User> queryAll() throws Exception;

    int addUser(User user) throws Exception;
}
