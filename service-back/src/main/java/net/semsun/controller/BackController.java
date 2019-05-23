package net.semsun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackController {
    @RequestMapping("/back")
    public String back() {
        return "back";
    }
}
