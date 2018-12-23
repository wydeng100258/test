package com.itcast.cotroller;

import com.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/test")
    public String test(String username, HttpServletRequest request) {
        System.out.println(username);
        request.setAttribute("name", username);
        return "success";
    }

    @RequestMapping("/test2")
    public String test2(String username, HttpServletRequest request, HttpSession session) {
        System.out.println(username);
        request.setAttribute("name", username);
        session.setAttribute("age", 18);
        return "success";
    }

    @RequestMapping("/test3")
    public ModelAndView test3(String username) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", username);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/test4")
    public String test4(String username, Model model) {
        System.out.println(username);
        model.addAttribute("name", username);
        return "success";
    }
    @RequestMapping("/test5")
    public void test5(String username, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(username);
        request.setAttribute("name",username);
        request.getRequestDispatcher("/pages/success.jsp").forward(request,response);
    }
    @RequestMapping("/test6")
    public String test6(User user,HttpServletRequest request){
        System.out.println(user);
        request.setAttribute("user",user);
        return "success";
    }
    @RequestMapping("/test7")
    public String test7(String username, Map map){
        System.out.println(username);
        map.put("name",username);
        map.put("age","20");
        return "success";
    }
    @RequestMapping("/test8")
    public @ResponseBody User test8(User user){
        System.out.println(user);
        user.setUsername("张家辉");
        user.setId(5);
        return user;
    }
    @RequestMapping("/test9")
    public @ResponseBody List<User> test9(User user){
        List<User> list = new ArrayList<>();
        User user1 = new User();
        user1.setId(5);
        user1.setUsername("梁家辉");
        list.add(user);
        list.add(user1);
        return list;
    }
}
