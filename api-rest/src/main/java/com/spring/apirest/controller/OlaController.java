package com.spring.apirest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OlaController {
    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "Oi carlão... muita força dedicação e esperança ";
    }
}
