package ru.anton.springcourse.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")              //opens the page and passes null, true -> 404
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam("surname") String surname, Model model){

       // System.out.println(String.format("Hello %s %s", name, surname));
        model.addAttribute("message", String.format("Hello %s %s", name, surname));
        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String goodByePage(){
        return "first/goodbye";
    }
}
