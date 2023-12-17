package com.example.cakeshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class biscuite {

    @GetMapping("/biscuite")
    public String getData() {return  "Please take my biscuite " ;}
}

