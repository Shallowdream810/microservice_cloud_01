package com.ghh.controller;


import com.ghh.bean.User;
import com.ghh.service.UserService;
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

    @GetMapping("/product/findone/{id}")
    public User findById(@PathVariable("id") Integer id){
        return userService.findById(id);
    }
    @GetMapping("/product/list")
    public List<User> findAll(){
        return userService.findAll();
    }
}
