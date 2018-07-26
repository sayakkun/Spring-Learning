package com.dev.CIWithCollectionExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
*/
public class Test {

	public static void main(String args[]) {
		/*
		 * Resource r=new ClassPathResource("applicationContext.xml");
		 * BeanFactory factory=new XmlBeanFactory(r); Question
		 * q1=(Question)factory.getBean("q"); q1.displayInfo(); Since,
		 * XmlBeanFactory is deprecated
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Question q1 = (Question) context.getBean("q1");
		q1.displayInfo();
	}

}
