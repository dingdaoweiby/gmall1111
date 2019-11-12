package com.sn.gmall1111.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.sn.gmall1111.user.mapper")
public class Gmall1111UserManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(Gmall1111UserManageApplication.class, args);
    }

}
