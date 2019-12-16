package com.ghh.mapper;

import com.ghh.bean.User;

import java.util.List;

public interface UserMapper {
    User findById(Integer id);
    List<User> findAll();
    void addproduct(User user);
}
