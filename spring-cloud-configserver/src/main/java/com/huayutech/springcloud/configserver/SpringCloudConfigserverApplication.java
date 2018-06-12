package com.huayutech.springcloud.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigserverApplication.class, args);
    }
}
