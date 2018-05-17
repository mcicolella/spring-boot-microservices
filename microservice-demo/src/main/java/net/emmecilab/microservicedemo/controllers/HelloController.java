package net.emmecilab.microservicedemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mauro Cicolella
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello() {
        return "Hello from Microservice Demo!!";
    }
}
