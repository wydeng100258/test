package com.itcast.controlller;

import com.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.ResponseWrapper;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
@Controller
@RequestMapping("/user")
public class ajexController {
    @RequestMapping("/test")
    public @ResponseBody User test(User user) {
        System.out.println(user);
        user.setUsername("李四");
        return user;
    }
    @RequestMapping("/save")
    public @ResponseBody List<User> save(User user){
        List<User>list = new ArrayList<>();
        User user1 = new User();
        user1.setId(2);
        user1.setUsername("张三");
        list.add(user);
        list.add(user1);
        return list;
    }
}
