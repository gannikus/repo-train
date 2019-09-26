package org.hzero.train.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.hzero.autoconfigure.oauth.EnableHZeroOauth;

@EnableHZeroOauth
@EnableDiscoveryClient
@SpringBootApplication
public class TrainOauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainOauthApplication.class, args);
    }
}


