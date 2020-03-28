package com.example.ciprocess.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/phones")
    public String sayHello(Model model){
        model.addAttribute("firstattribute", "--Contents of first attribute in the model--");
        System.out.println("Index");
        return "phones";
    }
}
