package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class HomeController {

    @RequestMapping("/")
    public String showPage(){
        return "home";
    }

    @RequestMapping("/showForm")
    public String showForm(){
        return "test-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "test-process";
    }
}
