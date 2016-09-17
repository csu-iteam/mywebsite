package cn.net.pikachu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.*;

/**
 * Created by pikachu on 2016/9/14 21:06 in
 * MethodAop
 */
@Component
@Aspect
public class MethodAop {
    @Pointcut("execution(public cn.net.pikachu..* *(..))")
    public void anyPublicMethod(){

    }
    @Around("anyPublicMethod()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        String className=joinPoint.getTarget().getClass().getName();
        String methodName=joinPoint.getSignature().getName();
        System.out.println("@Around before "+className+"类 "+methodName+"方法");
        Object o=joinPoint.proceed();
        System.out.println("@Around after "+className+"类 "+methodName+"方法");
        return o;
    }
}
