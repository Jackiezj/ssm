package com.itheima.controller;

import com.itheima.domain.UserInfo;
import com.itheima.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll () throws Exception {
        ModelAndView mv = new ModelAndView();
        List<UserInfo> userList = userService.findAll();
        mv.setViewName("user-list");
        mv.addObject("userList", userList);
        return mv;
    }

    @RequestMapping("/save.do")
    public String save (UserInfo user) throws Exception {
        userService.save(user);
        return "redirect:findAll.do";
    }
}
