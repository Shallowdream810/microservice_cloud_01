package com.ghh.service.Imp;

import com.ghh.bean.User;
import com.ghh.mapper.UserMapper;
import com.ghh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper  userMapper;

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
    @Override
    public void addproduct(User user) {
        userMapper.addproduct(user);
    }
}
