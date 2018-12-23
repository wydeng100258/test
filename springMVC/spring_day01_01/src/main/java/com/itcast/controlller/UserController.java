package com.itcast.controlller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@SuppressWarnings("all")
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testOne")
    public String testOne(String username, HttpServletRequest request) {
        System.out.println("testOne");
        request.setAttribute("name", username);
        return "success";
    }
    @RequestMapping("/testTwo")
    public ModelAndView testTwo(String username){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",username);
        mv.addObject("age",18);
        mv.setViewName("success");
        return mv;
    }

}
