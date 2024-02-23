package com.example.spring_first_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("addAdvert")
public class AddAdvertController {
    @GetMapping
    public String getAddAdvert(){
        return "addAdvert";
    }
    @PostMapping
    public String addAdvert(){
        return "";
    }
}