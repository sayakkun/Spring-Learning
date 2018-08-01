package com.dev.AWExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Person per1=(Person)context.getBean("person");
		per1.displayInfo();
	}
}
