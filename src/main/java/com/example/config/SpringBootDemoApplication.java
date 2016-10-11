package com.example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//@EnableAutoConfiguration
@EnableConfigurationProperties
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootDemoApplication {
	
    public static void main(String[] args) {
    	ContentNegotiatingViewResolver a1;
    	InternalResourceViewResolver b1;
    	BeanNameViewResolver c1;
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
    
}
