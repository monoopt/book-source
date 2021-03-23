package com.javaee.ticketsys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShapeController {
    @GetMapping("p2pdistance/{x1},{y1},{x2},{y2}")
    public String calDistance(@PathVariable float x1,
                              @PathVariable float x2,
                              @PathVariable float y1,
                              @PathVariable float y2) {
        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return Double.toString(distance);
    }

    @GetMapping("circle")
    public String calCircleArea(@RequestParam double r1, @RequestParam double r2) {
        double area = Math.PI * (r2*r2 -r1*r1);
        return  Double.toString(area);
    }
}
