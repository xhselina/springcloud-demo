package com.china.springcloud.ribbon.web;

import com.china.springcloud.ribbon.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 季先生 on 2017/6/7 9:59.
 *  服务消费程序
 */
@RestController
public class ConsumerController {
    @Autowired
    private ComputeService computeService;

//    @GetMapping("/add/{a}/{b}")
    @GetMapping("/add")
//    public String add(@PathVariable int a, @PathVariable int b){
    public String add(){
         return computeService.addService();
    }
}
