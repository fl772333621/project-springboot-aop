package com.mfanw.springboot_aop.controller;

import com.mfanw.springboot_aop.biz.IHelloWorldBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 抢购
 */
@RestController
public class HelloWorldController {

    @Autowired
    private IHelloWorldBiz helloWorldBiz;

    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello");
        return helloWorldBiz.sayHello();
    }

    @GetMapping("/world")
    public String world() {
        System.out.println("world");
        return helloWorldBiz.sayWorld();
    }

}
