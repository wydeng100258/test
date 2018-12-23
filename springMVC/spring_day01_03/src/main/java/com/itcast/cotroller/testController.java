package com.itcast.cotroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class testController {
    @RequestMapping(path = "/method",method = RequestMethod.GET,params = "username")
    public String method(){
        System.out.println("成功了");
        return "success";
    }
    @RequestMapping("/method2")
    public String method2(@RequestBody(required = false) String body){
        System.out.println(body);
        return "success";
    }

}
