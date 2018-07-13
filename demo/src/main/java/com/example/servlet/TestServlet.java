package com.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * @version [版本号, ]
 * @Author: zy
 * @Description:
 * @Date: Created in 2018/7/10 21:56.
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
//@WebServlet(urlPatterns = "/testServlet")   //servlet 3.0规范的注解
public class TestServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("TestServlet");
    }
}
