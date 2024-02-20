package com.nagp.app2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Locale;

@RestController
public class App2Controller {

    @GetMapping("/uppercase")
    public String convertToUpperCase(@RequestParam(name = "name") String name){

        return name.toUpperCase(Locale.ROOT);

    }
}
