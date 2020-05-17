package com.example.serviceconfig2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ServiceConfig2Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConfig2Application.class, args);
    }

}
