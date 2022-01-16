package com.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer")
    public String controller() {

        String ulr = "http://127.0.0.1:9001/hello";

        String res = restTemplate.getForObject(ulr, String.class);

        return res + " world";
    }
}
