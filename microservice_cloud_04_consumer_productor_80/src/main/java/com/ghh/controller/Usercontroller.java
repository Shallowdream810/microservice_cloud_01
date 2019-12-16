package com.ghh.controller;

import com.ghh.bean.User;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URL;
import java.util.List;
@RestController
public class Usercontroller {
    //声明一个接口
//    private static  final String HTTP_NAME = "http://localhost:8001/product/";
    private static  final String HTTP_NAME = "http://MICROSERVICE-PRODUCT";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consum/find/{id}")
    public User findone(@PathVariable("id")Integer id){
        String url = HTTP_NAME+"/product/findone/"+id;
        return  (User) restTemplate.getForObject(url,User.class);
    }
    @GetMapping("/consum/findAll")
    public List<User> getAll(){
        List<User> users = restTemplate.getForObject(HTTP_NAME + "/product/list", List.class);
        return users;
    }
}
