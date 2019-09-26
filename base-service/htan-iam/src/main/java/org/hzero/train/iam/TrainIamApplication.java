package org.hzero.train.iam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.hzero.autoconfigure.iam.EnableHZeroIam;

@EnableHZeroIam
@EnableDiscoveryClient
@SpringBootApplication
public class TrainIamApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainIamApplication.class, args);
    }
}


