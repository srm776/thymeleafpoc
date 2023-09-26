package com.rtmarkets.thymeleafpoc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class PersonController {

    @GetMapping("/getdata")
    String getPeople(Model model){
        model.addAttribute("something","This is coming from controller");
        model.addAttribute("people", Arrays.asList(
           new Person("Raj",21),
           new Person("Simon", 20),
           new Person("Roger",18)
        ));
        return  "people";
    }
}
