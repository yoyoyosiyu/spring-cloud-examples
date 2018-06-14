package com.huayutech.springcloud.config.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class IndexController {

    @Value("${spring.boot}")
    String greeting;

    @Value("${application.company}")
    String companyName;

    @GetMapping("/")
    public String doGet() {
        return greeting +"," + companyName;
    }

}
