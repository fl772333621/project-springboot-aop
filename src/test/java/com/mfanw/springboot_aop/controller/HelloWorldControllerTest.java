package com.mfanw.springboot_aop.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class HelloWorldControllerTest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    void say() {
        System.out.println(restTemplate.getForObject("http://127.0.0.1:8080/hello", String.class));
        System.out.println(restTemplate.getForObject("http://127.0.0.1:8080/world", String.class));
    }
}