package com.example.swagger.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootRestSwaggerController {

    @RequestMapping(method = RequestMethod.GET, value = "/test", produces = MediaType.TEXT_PLAIN_VALUE)
    public String test() {

        return "My Swagger App is running";

    }
}
