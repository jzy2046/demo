package com.example.demo.Service;

import com.example.demo.entity.User;

public interface UserService {
    public User getUserById(Integer userId);

    public boolean addUser(User record);
}
