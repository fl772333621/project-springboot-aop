package com.mfanw.springboot_aop.biz.impl;

import com.mfanw.springboot_aop.biz.IHelloWorldBiz;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldBizImpl implements IHelloWorldBiz {

    @Override
    public String sayHello() {
        System.out.println("biz say hello");
        return "hello";
    }

    @Override
    public String sayWorld() {
        System.out.println("biz say world");
        return "world";
    }
}
