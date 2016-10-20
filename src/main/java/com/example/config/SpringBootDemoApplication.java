package com.example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import de.codecentric.boot.admin.config.EnableAdminServer;

//@EnableAutoConfiguration
//@EnableConfigurationProperties
//@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan

@EnableConfigurationProperties
@SpringBootApplication
@EnableAdminServer
public class SpringBootDemoApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
    
}
