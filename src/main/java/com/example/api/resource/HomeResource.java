package com.example.api.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/home")
@RestController
public class HomeResource {

    @Value("${teste}")
    private String teste;

    @GetMapping
    public String getHome(){
        return teste;
    }


}
