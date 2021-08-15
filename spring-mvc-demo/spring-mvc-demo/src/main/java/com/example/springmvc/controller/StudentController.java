package com.example.springmvc.controller;

import com.example.springmvc.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model){
        // create student object
        Student student = new Student();

        // add to model
        model.addAttribute("student", student);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student){
        System.out.println("the student :" + student.getFirstName() + " " + student.getLastName());

        return "student-confirmation";
    }
}
