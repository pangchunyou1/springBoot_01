package com.atguigu.springBoot.controller;

import com.atguigu.springBoot.bean.Datasource;
import com.atguigu.springBoot.bean.JdbcDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {

//    @Autowired
//    Datasource datasource;

    @Autowired
    JdbcDatasource jdbcDatasource;

    @RequestMapping("hello")
    public String hello(String name){

        System.out.println("jdbcDatasource = " + jdbcDatasource);
//        System.out.println("datasource = " + datasource);
        return "你好"+name;
    }
}
