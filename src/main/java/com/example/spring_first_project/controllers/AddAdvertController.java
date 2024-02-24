package com.example.spring_first_project.controllers;

import com.example.spring_first_project.models.AdvertModel;
import com.example.spring_first_project.repos.AdvertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("addAdvert")
public class AddAdvertController {
    final
    AdvertRepository advertRepository;

    public AddAdvertController(AdvertRepository advertRepository) {
        this.advertRepository = advertRepository;
    }

    @GetMapping
    public String getAddAdvert(){
        return "addAdvert";
    }
    @PostMapping
    public String postData(@RequestParam String name, @RequestParam String price,
                           @RequestParam Integer weight, @RequestParam String size,
                           @RequestParam String disc){
        AdvertModel advert = new AdvertModel();
        advert.setName(name);
        advert.setWeight(weight.toString());
        advert.setPrice(price);
        advert.setDisk(disc);
        advert.setSize(size);
        advertRepository.save(advert);
        return "index";
    }
}
