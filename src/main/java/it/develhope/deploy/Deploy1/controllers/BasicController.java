package it.develhope.deploy.Deploy1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BasicController {

    @GetMapping("/{devName}")
    public String getDevName(@PathVariable String devName){
        return devName;
    }
}
