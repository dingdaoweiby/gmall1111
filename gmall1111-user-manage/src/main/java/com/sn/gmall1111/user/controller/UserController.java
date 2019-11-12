package com.sn.gmall1111.user.controller;

import com.sn.gmall1111.user.bean.UserInfo;
import com.sn.gmall1111.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("allUsers")
    public List<UserInfo> getAllUsers() {
        return userService.getUserInfoAll();
    }

    @PostMapping("addUser")
    public String addUser(UserInfo userInfo) {
        userService.addUser(userInfo);
        return "success";
    }

    @PostMapping("updateUser")
    public String updateUser(UserInfo userInfo) {
        userService.updateUser(userInfo);
        return "success";
    }

    @PostMapping("updateUserByName")
    public String updateUserByName(UserInfo userInfo) {
        userService.updateUserByName(userInfo.getName(),userInfo);
        return "success";
    }

    @GetMapping("getUser")
    public UserInfo getUserInfoById(String id) {
        return userService.getUserInfoById(id);
    }


    @PostMapping("deleteUser")
    public String deleteUser(UserInfo userInfo) {
        userService.deleteUser(userInfo);
        return "success";
    }
}
