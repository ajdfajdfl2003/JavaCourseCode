package io.kimmking.spring02;

import org.aspectj.lang.ProceedingJoinPoint;

public class Aop1 {
    
        //前置通知
        // 2
        public void startTransaction(){
            System.out.println("    ====>begin ding... ");
        }
        
        //后置通知
        // 4
        public void commitTransaction(){
            System.out.println("    ====>finish ding... ");
        }
        
        //环绕通知
        public void around(ProceedingJoinPoint joinPoint) throws Throwable{
            // 1
            System.out.println("    ====>around begin ding");
            //调用process()方法才会真正的执行实际被代理的方法
            joinPoint.proceed();

            // 3
            System.out.println("    ====>around finish ding");
        }
        
}
