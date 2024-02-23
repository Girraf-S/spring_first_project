package com.example.spring_first_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/allAdvert")
public class AllAdvertsController {
    @GetMapping
    public String getAllAdverts(){
        return "allAdverts";
    }
}
