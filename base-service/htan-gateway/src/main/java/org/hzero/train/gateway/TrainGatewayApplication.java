package org.hzero.train.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.hzero.autoconfigure.gateway.EnableHZeroGateway;

@EnableHZeroGateway
@EnableDiscoveryClient
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class TrainGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainGatewayApplication.class, args);
    }

}
