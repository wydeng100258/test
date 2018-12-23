package com.itcast.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/web")
public class WebController {
    @RequestMapping("/test1")
    public String test1(String username, HttpServletRequest request, HttpSession session){
        System.out.println(username);
        request.setAttribute("name",username);
        return "redirect:/web/test2";
    }
    @RequestMapping("/test2")
    public String test2(HttpSession session,HttpServletRequest request){
        String name = (String) request.getAttribute("name");
        System.out.println(name);
        return "success";
    }

}
