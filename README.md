# SpringBoot AOP 测试

主要测试了如何在SpringBoot中启用AOP

1. 添加AOP依赖
```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-aop</artifactId>
</dependency>
```

2. 添加切面类
```java
@Aspect
@Component
public class LogAspect {
}
```

3. 在切面类内添加切面（可添加多个切面）
```java
/**
 * 定义一个切面，符合该切面配置的都将被我拦截<br />
 * 本次拦截为该项目下的Controller全部类的全部方法
 */
@Pointcut("execution(public * com.mfanw.springboot_aop.controller.*.*(..))")
public void controllerLog() {
}
```

4. 在切面类内添加切面的处理方法

|JoinPoint|含义|
| ---- | ---- |
|@Before|在方法前执行|
|@After|在方法后执行|
|@AfterReturn|在方法执行后返回一个结果后执行|
|@AfterReturning|在方法执行后返回一个结果后执行|
|@AfterThrowing|在方法执行过程中抛出异常的时候执行|
|@Around|环绕通知，就是可以在执行前后都使用，这个方法参数必须为ProceedingJoinPoint，proceed()方法就是被切面的方法，上面四个方法可以使用JoinPoint，JoinPoint包含了类名，被切面的方法名，参数等信息。|

