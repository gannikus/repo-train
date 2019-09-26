package org.hzero.train.platform;

import org.hzero.autoconfigure.platform.EnableHZeroPlatform;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableHZeroPlatform
@EnableDiscoveryClient
@SpringBootApplication()
public class TrainPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainPlatformApplication.class, args);
    }

}
