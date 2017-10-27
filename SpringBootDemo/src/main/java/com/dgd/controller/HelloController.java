package com.dgd.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author DGD
 * @date 2017/10/27.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello "+name+"!";
    }
}
