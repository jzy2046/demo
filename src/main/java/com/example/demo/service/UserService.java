package com.example.demo.service;


import com.example.demo.model.User;

public interface UserService {
    public User getUserById(int userId);

    boolean addUser(User record);

}