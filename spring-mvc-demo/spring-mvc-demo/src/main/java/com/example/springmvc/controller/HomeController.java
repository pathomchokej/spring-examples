package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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

    //@RequestMapping("/processForm")
    public String processForm(){
        return "test-process";
    }

    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model){
        String name = request.getParameter("studentName");
        String newMessage = "Yo! " + ((null != name && !name.isEmpty())? name.toUpperCase() : "Anonymous");
        model.addAttribute("message", newMessage);

        return "test-process2";
    }
}
