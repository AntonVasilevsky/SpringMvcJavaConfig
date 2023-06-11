package ru.anton.springcourse.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class Calculator {


    @GetMapping("/calculator")
    public String calculatorView(@RequestParam(value = "a") int a,
                                 @RequestParam(value = "b") int b,
                                 @RequestParam(value = "action") char action, Model model){
        int result = 0;
        switch (action){
            case '+': result = a+b;
            break;
            case '-': result = a-b;
            break;
            case '*': result = a*b;
            break;
            case '/': result = a/b;

        };
        model.addAttribute("result_display", String.format("%d%c%d%c%d", a, action, b, '=', result));
        return "first/calculator_view";
    }

}
