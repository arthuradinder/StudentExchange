package org.ArthurProjects.myApplication;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class ApplicationController {
    @RequestMapping("/")
    String home() {
        return "Welcome to The Exchange Program";
    }
}
