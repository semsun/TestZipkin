package net.semsun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FrontController {
    @RequestMapping("/front")
    public String front() {
        String ret = new RestTemplate().getForObject("http://127.0.0.1:8320/back", String.class);
        return "front " + ret;
    }
}
