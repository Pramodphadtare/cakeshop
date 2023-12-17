package com.example.cakeshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class khari {

    @GetMapping("/khari")
    public String getData() {return  "Please take my khari " ;}
}
