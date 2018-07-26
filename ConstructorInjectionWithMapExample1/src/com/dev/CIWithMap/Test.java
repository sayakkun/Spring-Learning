package com.dev.CIWithMap;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Question q1=(Question)context.getBean("q1");
		q1.displayInfo();
	}
}
