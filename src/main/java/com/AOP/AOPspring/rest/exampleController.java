package com.AOP.AOPspring.rest;

import com.AOP.AOPspring.aop.TrackTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class exampleController {

    @TrackTime
    @GetMapping("")
    public String exampleEndpoint() {
        return "Example";
    }

    @TrackTime
    @GetMapping("/exception")
    public String exception() {
        throw new IllegalArgumentException("IllegalArgumentException throw in method !");
    }
}
