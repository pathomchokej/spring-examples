package com.example.springmvc;

import com.xuggle.mediatool.IMediaReader;
import com.xuggle.mediatool.IMediaWriter;
import com.xuggle.mediatool.ToolFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    ConvertWebMToMp4 converter;

    @RequestMapping("/")
    public String convertForm(Model model){
        ConvertData convertInfo = new ConvertData();

        // add to model
        model.addAttribute("convertInfo", convertInfo);

        return "convert-form";
    }

    @RequestMapping("/processForm")
    public String convert(@ModelAttribute("convertInfo") ConvertData convertInfo){

        String message = converter.Convert(convertInfo.getSource(), convertInfo.getDestination());
        convertInfo.setElapsedTime(message);

        return "index";
    }

}
