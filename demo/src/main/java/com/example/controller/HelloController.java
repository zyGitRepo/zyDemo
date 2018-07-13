package com.example.controller;

import com.example.domain.NeoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version [版本号, ]
 * @Author: zy
 * @Description:
 * @Date: Created in 2018/6/27 16:58.
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
//@RestController
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private ApplicationArguments applicationArguments;

    @Autowired
    private NeoProperties neoProperties;

    @RequestMapping("/first")
    @ResponseBody
    public String helloSpringBoot()
    {
        //System.out.println(applicationArguments.getNonOptionArgs());
        System.out.println(neoProperties.toString());
        //return "Hello! My first SpringBoot Demo.";
        return neoProperties.toString();
    }
}
