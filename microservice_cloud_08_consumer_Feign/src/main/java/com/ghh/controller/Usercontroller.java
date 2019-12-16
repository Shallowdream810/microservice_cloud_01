package com.ghh.controller;

import com.ghh.bean.User;
import com.ghh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class Usercontroller {
    @Resource
    private UserService userService;
    @GetMapping("/consum/find/{id}")
    public User findone(@PathVariable("id")Integer id){
        return userService.findById(id);
    }
    @GetMapping("/consum/findAll")
    public List<User> getAll(){
        return userService.findAll();
    }
    @GetMapping("/consum/findAll")
    public List<User> getAll1(){
        return userService.findAll();
    }
}
