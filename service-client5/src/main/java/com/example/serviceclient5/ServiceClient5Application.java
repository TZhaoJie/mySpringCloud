package com.example.serviceclient5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceClient5Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceClient5Application.class, args);
    }

}
