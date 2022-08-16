package spring.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* spring.service.CustomerService.printName(..))")
    public void logBeforeTransfer(JoinPoint jp) {
        System.out.print("#### Вызов метода LoggingAspect.logBeforeTransfer()");
        System.out.println(", args=[" + getArgs(jp) + "]");
    }

    private String getArgs(JoinPoint jp) {
        return Arrays.stream(jp.getArgs()).map(Object::toString).collect(Collectors.joining(","));
    }

    @After("execution(* spring.service.CustomerService.printName(..))")
    public void logAfterTransfer() {
        System.out.println("#### Вызов метода LoggingAspect.logAfterTransfer()");
    }

    @AfterReturning("execution(* spring.service.CustomerService.printName(..))")
    public void logAfterReturning() {
        System.out.println("#### Вызов метода LoggingAspect.logAfterReturning()");
    }

    @Around("execution(* spring.service.CustomerService.printName(..))")
    public String logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("#### Вызов метода LoggingAspect.logAround() до выполнения метода");
        joinPoint.proceed();
        System.out.println("#### Вызов метода LoggingAspect.logAround() после выполнения метода");
        return "По хорошему что-то возвращает";
    }

}
