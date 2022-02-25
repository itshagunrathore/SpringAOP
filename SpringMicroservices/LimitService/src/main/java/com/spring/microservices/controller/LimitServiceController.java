package com.spring.microservices.controller;

import com.spring.microservices.demo.ConfigurationClass;
import com.spring.microservices.dto.LimitServiceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LimitServiceController {
    @Autowired
    ConfigurationClass config;

    @GetMapping("/limits")
    public LimitServiceDto getLimitConfiguration() {

        return new LimitServiceDto(config.getMin(), config.getMax());
    }

}
