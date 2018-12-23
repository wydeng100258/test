package com.itcast.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@SuppressWarnings("all")
//@Controller
@RequestMapping(path = "/anno")
public class AnnoController {
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("hello spring");
        return "success";
    }
    @RequestMapping(path = "/save")
    public String save(){
        System.out.println("hello");
        return "error";
    }
    @RequestMapping(path = "/testRequestParam")
    public String delete(String name){
        System.out.println(name);
        return "success";
    }
    public String saveString(Model model){
        System.out.println("成功了");
        return "secess";
    }
}
