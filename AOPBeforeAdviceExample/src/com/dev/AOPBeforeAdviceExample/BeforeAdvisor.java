package com.dev.AOPBeforeAdviceExample;
import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;  
public class BeforeAdvisor implements MethodBeforeAdvice{
	@Override
	public void before(Method method, Object[] args, Object target)throws Throwable {  
        System.out.println("Additional concern before actual business logic");  
    }  
}
