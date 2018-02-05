package com.example.demo.Service.Impl;

import com.example.demo.Service.UserService;
import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean addUser(User record) {
        boolean result=false;
        try {
            userMapper.insertSelective(record);
            result=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
