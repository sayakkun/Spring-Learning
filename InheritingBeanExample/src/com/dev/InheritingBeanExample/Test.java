package com.dev.InheritingBeanExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee emp1=(Employee)context.getBean("Employee1");
		emp1.displayInfo();
	}
}
/*Note, that spring bean inheritance has nothing to do with java inheritance
But the concept is same
you can make a parent bean pure abstract
by doing something like this:
 <bean id = "beanTeamplate" abstract = "true">
 	<!--constructor-args-->
 	<!--or property-->
   </bean>
*/
