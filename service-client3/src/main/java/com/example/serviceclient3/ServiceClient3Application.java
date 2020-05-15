package com.example.serviceclient3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceClient3Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceClient3Application.class, args);
    }

}
