package com.ghh.service;

import com.ghh.bean.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
    void addproduct(User user);
}
