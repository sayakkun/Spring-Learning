package com.dev.ConstructorDIExample;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
public class Test {
public static void main(String[] args) {
		
		Resource r=new ClassPathResource("ApplicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		
		Employee emp=(Employee)factory.getBean("emp1");
		emp.show();
		
	}

}
