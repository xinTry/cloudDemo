package com.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yuxin
 * @title: SpringCloudEurekaApplication
 * @description: 启动类
 * @date 2019-09-09 14:55
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaApplication.class,args);
    }
}   