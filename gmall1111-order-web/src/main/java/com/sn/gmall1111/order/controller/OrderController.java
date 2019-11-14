package com.sn.gmall1111.order.controller;

import com.sn.gmall1111.bean.UserInfo;
import com.sn.gmall1111.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    
    UserService userService;

    @GetMapping("trade")
    public String trade(String userid) {
        UserInfo userInfo = userService.getUserInfoById(userid);
        return "success";
    }

}
