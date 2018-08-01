package com.dev.AWExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		A objA =(A)context.getBean("a");
		//it returns an object to Type Object
		objA.display();
	}
}
