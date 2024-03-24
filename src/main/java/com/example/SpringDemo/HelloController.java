package com.example.SpringDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello()
    {
        return "<b>Hello World</b>";
    }

    @GetMapping("/test")
    public String getTest()
    {
        return "testing123";
    }

}
