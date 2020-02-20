package com.lu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("getUser")
    @ResponseBody
    public String getUser(){
        return "SpringBoot 真香";
    }
}
