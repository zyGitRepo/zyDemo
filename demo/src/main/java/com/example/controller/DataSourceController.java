package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

/**
 * @version [版本号, ]
 * @Author: zy
 * @Description:
 * @Date: Created in 2018/7/3 21:30.
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Controller
@RequestMapping("/dataSource")
public class DataSourceController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping("/page")
    @ResponseBody
    public Object dataSourcePage() throws Exception{
        System.out.println(dataSource.getConnection());
        System.out.println(dataSource);

        return "Hello DataSource!";
    }
}
