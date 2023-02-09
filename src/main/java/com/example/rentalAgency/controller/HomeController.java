package com.example.rentalAgency.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@CrossOrigin(origins = "http://localhost:4200/")
public class HomeController {

    @GetMapping("/all")
    public String home(){
        return "This is for all";
    }

}
