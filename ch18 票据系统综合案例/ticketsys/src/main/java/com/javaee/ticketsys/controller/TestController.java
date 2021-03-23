package com.javaee.ticketsys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("test/{x1},{y1},{x2},{y2}")
    public String getParam(@PathVariable float x1, @PathVariable float x2, @PathVariable float y1,
                            @PathVariable float y2){
        return Double.toString(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)));
    }
}
