package com.lpf.eureka.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//注册中心
public class EurekaServer023Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer023Application.class, args);
    }
}
