package com.crossing.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * 用于记录日志的工具类，它里面提供了公共的代码
 */
@Component("logger")
@Aspect //表示当前类是一个切面类
@EnableAspectJAutoProxy
public class Logger {

    @Pointcut("execution(* com.crossing.service.impl.*.*(..))")
    private void pt1(){

    }
    /**
     * 前置通知
     */
    //@Before("pt1()")
    public void beforePrintLog(){
        System.out.println("前置通知Logger类中的beforePrintLog方法开始记录日志了。。。");
    }

    /**
     * 后置通知
     */
    //@AfterReturning("pt1()")
    public void afterReturningPrintLog(){
        System.out.println("后置通知Logger类中的afterReturningPrintLog方法开始记录日志了。。。");
    }
    /**
     * 异常通知
     */
    //@AfterThrowing("pt1()")
    public void afterThrowingPrintLog(){
        System.out.println("异常通知Logger类中的afterThrowingPrintLog方法开始记录日志了。。。");
    }

    /**
     * 最终通知
     */
    //@After("pt1()")
    public void afterPrintLog(){
        System.out.println("最终通知Logger类中的afterPrintLog方法开始记录日志了。。。");
    }

    @Around("pt1()")
    public Object aroundPrintLog(ProceedingJoinPoint pjp){

        Object rtValue = null;
        try {
            Object[] args = pjp.getArgs();//得到方法执行所需的参数

            System.out.println("Logger类中的aroundPringLog方法开始记录日志了。。。前置");

            rtValue = pjp.proceed(args);//明确调用业务层方法（切入点方法）

            System.out.println("Logger类中的aroundPringLog方法开始记录日志了。。。后置");

            return rtValue;
        } catch (Throwable throwable) {
            System.out.println("Logger类中的aroundPringLog方法开始记录日志了。。。异常");
            throwable.printStackTrace();
        }finally {
            System.out.println("Logger类中的aroundPringLog方法开始记录日志了。。。最终");
        }
        return rtValue;
    }

}
