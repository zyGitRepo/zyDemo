package com.example;

import com.example.domain.NeoProperties;
import com.example.filter.TestFilter;
import com.example.intercepter.TestIntercepter;
import com.example.listener.TestListener;
import com.example.servlet.TestServlet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication	//自带扫描器，会将本包及子包下所有标注@Controller @Service等注解的类，扫描成对象，放入spring容器中
@MapperScan("com.example.mapper")		//会将该包下所有的接口全部扫描成对象，放入spring容器中
@EnableTransactionManagement		//开启事务的注解,也可不配
//@ServletComponentScan		//扫描当前包及子包的@WebServlet @WebFilter @WebListener等注解,将采用servlet3.0注解方式的servlet，filter,listener注册到容器中
public class DemoApplication extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(myInterceptor()).addPathPatterns("/*");
	}

	@Bean
	public TestIntercepter myInterceptor() {
		return new TestIntercepter();
	}

	@Bean
	@ConfigurationProperties("neo")
	public NeoProperties getNeoProperties(){
		return new NeoProperties();
	}

	/*************************在此区间的代码是用springboot的方式注册servlet，filter,listener***************************/

	/*@Bean
	public ServletListenerRegistrationBean<TestListener> testListener(){
		ServletListenerRegistrationBean<TestListener> bean = new ServletListenerRegistrationBean<TestListener>();
		bean.setListener(new TestListener());
		return bean;
	};*/

	/*@Bean
	public FilterRegistrationBean testFilter(){
		FilterRegistrationBean bean = new FilterRegistrationBean();
		bean.setFilter(new TestFilter());
		bean.addUrlPatterns("*//*");
		return bean;
	};*/

	/*@Bean
	public ServletRegistrationBean testServlet(){
		ServletRegistrationBean bean = new ServletRegistrationBean();
		bean.setServlet(new TestServlet());
		bean.addUrlMappings("/testServlet");
		return bean;
	};*/
	/*************************在此区间的代码是用springboot的方式注册servlet，filter,listener***************************/

	/*@Bean
	@ConfigurationProperties("db")
	public DataSource dataSource(){
		DruidDataSource ds = new DruidDataSource();
		return ds;
	}*/

	public static void main(String[] args) {
		//System.out.println(Arrays.toString(args));
		SpringApplication.run(DemoApplication.class, args);
	}
}
