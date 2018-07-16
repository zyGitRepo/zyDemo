package com.example.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.HandlerMethod;

/**
 * @version [版本号, ]
 * @Author: zy
 * @Description: 统一异常处理类
 * @Date: Created in 2018/7/10 22:27.
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
//@ControllerAdvice(basePackages = "com.example.controller")   //为测试错误页面跳转，临时注释掉
public class ErrControllerAdvice {

    @ExceptionHandler(Exception.class)
    public void handlerException(Exception e, HandlerMethod handlerMethod){
        System.out.println("统一异常处理");
        System.out.println(e.getMessage());
        System.out.println(handlerMethod.getBean().getClass());
        System.out.println(handlerMethod.getMethod().getName());
    }
}
