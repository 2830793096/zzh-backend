package com.example.test8.controller;

import com.example.test8.vo.newVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
//RestController返回的是Json字符串而不是一个页面，用于前后端分里开发
//Controller返回的是一个页面，用于传统的前后端不分离开发
@RestController
@RequestMapping("/hi")
public class HelloController {

    @GetMapping("/")
    public String test(){
        List<newVO> list=new ArrayList<>();
        list.add(new newVO("new"));
        return "hello";
    }
}
