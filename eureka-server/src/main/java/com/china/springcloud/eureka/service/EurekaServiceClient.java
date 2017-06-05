package com.china.springcloud.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by 季先生 on 2017/6/5 21:54.
 * eureka server
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceClient {
    public static void main(String[] args) {
        SpringApplication.run(EnableEurekaServer.class, args);
    }
}
