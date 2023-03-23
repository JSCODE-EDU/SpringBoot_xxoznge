package com.example.springboot_class.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParameterController {
    @GetMapping("api/xxoznge1")
    public String test(@RequestParam String name){
        return "내 이름은 "+name;
    }
}
