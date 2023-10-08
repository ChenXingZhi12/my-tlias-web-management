package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class MyTliasWebManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyTliasWebManagementApplication.class, args);
    }

}
