package com.mfanw.springboot_aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 日志切面类。<br />
 * 使用@Aspect表明该类是一个切面类
 * 使用@Component表明将当前类注入到Spring容器内
 */
@Aspect
@Component
public class LogAspect {

    /**
     * 定义一个切面，符合该切面配置的都将被我拦截<br />
     * 本次拦截为该项目下的Controller全部类的全部方法
     */
    @Pointcut("execution(public * com.mfanw.springboot_aop.controller.*.*(..))")
    public void controllerLog() {
    }

    /**
     * 定义一个切面，符合该切面配置的都将被我拦截<br />
     * 本次拦截为该项目下的Biz全部类的全部方法
     */
    @Pointcut("execution(public * com.mfanw.springboot_aop.biz.*.*(..))")
    public void bizLog() {
    }

    /**
     * 切入点之前执行
     */
    @Before("controllerLog()")
    public void doBeforeController(JoinPoint joinPoint) {
        System.out.println("doBeforeController");
    }

    /**
     * 切入点之后执行
     */
    @After("controllerLog()")
    public void doAfterController(JoinPoint joinPoint) {
        System.out.println("doAfterController");
    }

    /**
     * 切入点返回之后执行
     */
    @AfterReturning("controllerLog()")
    public void doAfterReturningController(JoinPoint joinPoint) {
        System.out.println("doAfterReturningController");
    }

    /**
     * 切入点抛出异常之后执行
     */
    @AfterThrowing("controllerLog()")
    public void doAfterThrowingController(JoinPoint joinPoint) {
        System.out.println("doAfterThrowingController");
    }

    /**
     * 切入点环绕
     */
    @Around("controllerLog()")
    public Object doAroundController(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("doAroundController");
        return joinPoint.proceed();
    }

    /**
     * 切入点环绕
     */
    @Around("bizLog()")
    public Object doAroundBiz(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("doAroundBiz");
        return joinPoint.proceed();
    }
}
