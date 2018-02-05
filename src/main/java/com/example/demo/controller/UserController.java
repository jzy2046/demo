package com.example.demo.controller;

import com.example.demo.Service.SysUsersService;
import com.example.demo.Service.UserService;
import com.example.demo.entity.SysUsers;
import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private SysUsersService sysUsersService;
    @RequestMapping("/showUser")
    @ResponseBody
    public User toIndex(HttpServletRequest request){
        int userId=Integer.parseInt(request.getParameter("id"));
        User user=userService.getUserById(userId);
        return user;
    }
    @RequestMapping("/showSystemUser")
    @ResponseBody
    public SysUsers showSystemUser(HttpServletRequest request){
        Long id=Long.parseLong(request.getParameter("id"));
        SysUsers sysUsers = sysUsersService.selectByPrimaryKey(id);
        return sysUsers;
    }
}
