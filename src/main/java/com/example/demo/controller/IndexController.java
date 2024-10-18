package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class IndexController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @PostMapping("/hai")
    public String sayHai(@RequestBody HaiRequest haiRequest) {
        return "Hai";
    }
}
