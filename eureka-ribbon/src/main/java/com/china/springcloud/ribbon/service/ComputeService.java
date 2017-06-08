package com.china.springcloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 季先生 on 2017/6/8 9:37.
 */
@Service
public class ComputeService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService() {
        int a = 100;
        int b= 200;
        return restTemplate.getForEntity("http://compute-service/add?a=" + a + "&b=" + b, String.class).getBody();
    }

    public String addServiceFallback() {
        return "error";
    }
}
