package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class DemoController {

    @PostMapping("/ping")
    public DemoResponse ping(@Valid @RequestBody DemoRequest request) {
        return new DemoResponse(request.getMsg() + " pong");
    }
}
