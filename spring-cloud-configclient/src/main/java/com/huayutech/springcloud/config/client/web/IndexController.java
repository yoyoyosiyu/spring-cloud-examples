package com.huayutech.springcloud.config.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${spring.boot}")
    String greeting;

    @GetMapping("/")
    public String doGet() {
        return greeting;
    }

}
