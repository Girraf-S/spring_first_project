package com.example.spring_first_project.controllers;

import com.example.spring_first_project.models.AdvertModel;
import com.example.spring_first_project.repos.AdvertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/advert" )
public class AdvertController {
    @Autowired
    AdvertRepository advertRepository;
    @GetMapping("{id}")
    public String getAdvert(@PathVariable("id") long id, Model model){
        AdvertModel advert = new AdvertModel();
        advert = advertRepository.findById(id).get();
        model.addAttribute("advert", advert);
        return "advert";
    }
}
