package com.example.filter;

import com.example.listener.TestListener;
import com.example.servlet.TestServlet;
import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Configuration
public class WebConfiguration {
    /*@Bean
    public RemoteIpFilter remoteIpFilter() {
        return new RemoteIpFilter();
    }

    @Bean
    public FilterRegistrationBean testFilterRegistration() {

        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter());
        registration.addUrlPatterns("*//*");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("MyFilter");
        registration.setOrder(1);
        return registration;
    }*/
    @Bean
    public FilterRegistrationBean testFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new TestFilter());
        bean.addUrlPatterns("/*");
        return bean;
    };

    @Bean
    public ServletListenerRegistrationBean<TestListener> testListener(){
        ServletListenerRegistrationBean<TestListener> bean = new ServletListenerRegistrationBean<TestListener>();
        bean.setListener(new TestListener());
        return bean;
    };

    @Bean
    public ServletRegistrationBean testServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean();
        bean.setServlet(new TestServlet());
        bean.addUrlMappings("/testServlet");
        return bean;
    };

    /*public class MyFilter implements Filter {
        @Override
        public void destroy() {
            System.out.println("********I am filter, I was dead**********");
        }

        @Override
        public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain filterChain)
                throws IOException, ServletException {
            HttpServletRequest request = (HttpServletRequest) srequest;
            System.out.println("******************this is MyFilter,url :"+request.getRequestURI());
            filterChain.doFilter(srequest, sresponse);
        }

        @Override
        public void init(FilterConfig arg0) throws ServletException {
            System.out.println("********I am filter, I was inited");
        }
    }*/
}
