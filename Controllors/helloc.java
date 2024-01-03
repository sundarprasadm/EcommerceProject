package com.prasad.captoneprojectecommerce.Controllors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloc {
    @GetMapping("/say/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return "Hello "+name;
    }
}
