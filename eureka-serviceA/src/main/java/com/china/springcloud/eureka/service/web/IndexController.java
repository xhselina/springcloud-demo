package com.china.springcloud.eureka.service.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 季先生 on 2017/6/6 20:13.
 */
@RestController
//@RequestMapping("service/a")
public class IndexController {
    
    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping("/")
    public String say(){
        return "我是服务eureka-serviceA";
    }

    @GetMapping("/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b ){
//        Registration registration =
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        logger.info("/add,host:{},service_id:{},result:{}",instance.getHost(),instance.getServiceId(),(a+b) + "");
        return  a  + b;
    }
}
