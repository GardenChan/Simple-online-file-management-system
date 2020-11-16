package com.myharbour.controller;

import com.myharbour.entity.User;
import com.myharbour.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

//    登陆方法
    @PostMapping("/login")
    public String login(User user, HttpSession session){
        User userDB = userService.login(user);
        if (userDB!=null){
            session.setAttribute("user",userDB);
            return "redirect:/file/showAll";
        }else{
            return "redirect:/index";
        }
    }
}
