package com.javanibble.springboot.examples.docker.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hellodocker")
public class HelloDockerController {


    @RequestMapping(method = RequestMethod.GET)
    public String displayMessage(@RequestParam(required = false, value = "name") String name) {
        if (name == null) {
            return "Hello Docker !!! \n\n";
        }
        return "Hello " + name +  " !!! \n\n";
    }

}
