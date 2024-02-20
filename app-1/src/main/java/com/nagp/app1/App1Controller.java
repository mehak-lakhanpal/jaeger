package com.nagp.app1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class App1Controller {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/transform")
    public String transform(@RequestParam(name = "name") String name){

        return restTemplate.getForEntity("http://localhost:9856/uppercase?name="+name, String.class).getBody();

    }
}
