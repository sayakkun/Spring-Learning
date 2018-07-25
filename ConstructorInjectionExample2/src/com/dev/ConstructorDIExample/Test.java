package com.dev.ConstructorDIExample;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.dev.ConstructorDIExample.config.EmployeeConfig;
import com.dev.ConstructorDIExample.Employee;
class Test {
	public static void main(String args[]){
		System.out.println("Reaching here");
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee emp=(Employee)ctx.getBean("employee");
		emp.show();
	}
}
/*Note: check about the spring jar versions
Otherwise, it would be extreme hectic
I tried to write the same code with spring 3.1.0
Lot off function definitions are not there
Hence, gave a lot of errors
I could not fix it
I switched to spring 5.0 (almost latest)
*/
/*Also, following spring libraries are to be installed
spring beans 5.0.0
springs-context 5.0,0
springs-core-5.0.0
springs-expression-5.0.0
com.springsource.org.apache.commons.logging-1.1.1
aop-5.0.0
*/