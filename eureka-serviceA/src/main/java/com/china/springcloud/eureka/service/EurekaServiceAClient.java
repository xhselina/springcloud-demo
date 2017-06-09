package com.china.springcloud.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by 季先生 on 2017/6/6 20:08.
 */
@EnableDiscoveryClient
@SpringBootApplication
//@EnableEurekaClient
public class EurekaServiceAClient {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceAClient.class,args);
    }
}
