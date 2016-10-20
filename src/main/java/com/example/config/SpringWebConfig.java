package com.example.config;

import javax.servlet.Filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.example.config.etc.ConnectionProperties;
import com.example.filter.CharsetFilter;

/**
 * 
 * 
 * @ClassName: SpringWebConfig
 * @Description TODO
 * @author zhaoqiang
 * @date: 2016年8月22日 下午3:45:50
 */
@Configuration
//@EnableWebMvc
@ComponentScan(basePackages = { "com.example.controller", "com.example.service" })
public class SpringWebConfig extends WebMvcConfigurerAdapter {
	
	@Autowired
	private ConnectionProperties connectionProperties;

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		System.out.println("=========" + connectionProperties.getRemoteAddress());
		// 加载swagger页面
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

	@Bean(name = "charsetFilter")
	public Filter charsetFilter() {
		return new CharsetFilter();
	}

	@Bean
	public FilterRegistrationBean charsetFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(charsetFilter());
		registration.addUrlPatterns("/*");
		registration.setName("charsetFilter");
		return registration;
	}

}
