package com.china.springcloud.eureka.service.web;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
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

//    @Autowired
//    private DiscoveryClient discoveryClient;

    @GetMapping("/")
    public String say(){
        return "我是服务eureka-serviceA";
    }

    @GetMapping("/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b ){
       return  a  + b;
    }
}
