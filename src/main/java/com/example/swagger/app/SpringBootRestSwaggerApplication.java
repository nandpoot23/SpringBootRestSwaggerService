package com.example.swagger.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example" })
@EnableAutoConfiguration
@Configuration
@EnableSwagger2
public class SpringBootRestSwaggerApplication {

    public static void main(String[] args) {
        
        SpringApplication.run(SpringBootRestSwaggerApplication.class, args);
    }
}