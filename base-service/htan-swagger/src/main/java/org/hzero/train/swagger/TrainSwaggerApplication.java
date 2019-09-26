package org.hzero.train.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.hzero.autoconfigure.swagger.EnableHZeroSwagger;


@EnableHZeroSwagger
@EnableDiscoveryClient
@SpringBootApplication
public class TrainSwaggerApplication {


    public static void main(String[] args) {
        SpringApplication.run(TrainSwaggerApplication.class, args);
    }
}


