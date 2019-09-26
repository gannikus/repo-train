package org.hzero.train.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import org.hzero.autoconfigure.register.EnableHZeroRegister;

@EnableHZeroRegister
@EnableEurekaServer
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class TrainRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainRegisterApplication.class, args);
    }
}


