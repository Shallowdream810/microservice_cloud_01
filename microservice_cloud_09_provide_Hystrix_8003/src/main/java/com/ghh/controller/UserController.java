package com.ghh.controller;


import com.ghh.bean.User;
import com.ghh.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //正常的功能方法
    @GetMapping("/product/findone/{id}")
    public User findById(@PathVariable("id") Integer id) {
        User user = userService.findById(id);
        if (null == user){
            throw  new  RuntimeException("该"+id+"没有对应信息");
        }
        return user;
    }

    @GetMapping("/product/list")
    public List<User> findAll(){
        return userService.findAll();
    }
}
