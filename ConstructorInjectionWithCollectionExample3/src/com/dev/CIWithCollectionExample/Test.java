package com.dev.CIWithCollectionExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.dev.CIWithCollectionExample.config.QuestionConfig;
import com.dev.CIWithCollectionExample.Question;
class Test {
	public static void main(String args[]){
		System.out.println("Reaching here");
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(QuestionConfig.class);
		Question q1=(Question)ctx.getBean("q1");
		q1.displayInfo();
	}
}