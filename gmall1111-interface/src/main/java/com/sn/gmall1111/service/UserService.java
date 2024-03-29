package com.sn.gmall1111.service;



import com.sn.gmall1111.bean.UserInfo;

import java.util.List;

public interface UserService {

    List<UserInfo> getUserInfoAll();

    void addUser(UserInfo userInfo);

    void updateUser(UserInfo userInfo);

    void updateUserByName(String name, UserInfo userInfo);

    void deleteUser(UserInfo userInfo);

    UserInfo getUserInfoById(String id);

}
