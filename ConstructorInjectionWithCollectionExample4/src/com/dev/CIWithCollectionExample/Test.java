package com.dev.CIWithCollectionExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.dev.CIWithCollectionExample.config.*;
public class Test {
	public static void main(String args[]){
		ApplicationContext ctx=new AnnotationConfigApplicationContext(QuestionConfig.class);
		Question q1=(Question)ctx.getBean("question1");
		q1.displayInfo();
	}

}
