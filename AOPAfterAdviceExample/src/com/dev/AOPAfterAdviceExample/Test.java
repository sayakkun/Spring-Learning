package com.dev.AOPAfterAdviceExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		BusinessLogic businessLogicObj=context.getBean("proxy",BusinessLogic.class);
		businessLogicObj.display();
	}
}
