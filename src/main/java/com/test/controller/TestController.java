package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by jzx on 2024/10/15 20:50
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "hello word! " + LocalDateTime.now();
    }
}
