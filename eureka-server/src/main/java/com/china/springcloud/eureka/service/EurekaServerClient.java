package com.china.springcloud.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by 季先生 on 2017/6/5 21:54.
 * eureka 主要用于服务发现
 */

@SpringBootApplication
// 服务发现的注解
@EnableEurekaServer
public class EurekaServerClient {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerClient.class, args);
    }
}
