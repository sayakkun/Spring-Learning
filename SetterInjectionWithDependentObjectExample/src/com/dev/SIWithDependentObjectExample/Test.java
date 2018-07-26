package com.dev.SIWithDependentObjectExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee emp1=(Employee)context.getBean("Employee1");
		emp1.displayEmpInfo();
	}
}
