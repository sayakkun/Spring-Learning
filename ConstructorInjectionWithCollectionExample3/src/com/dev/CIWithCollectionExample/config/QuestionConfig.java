package com.dev.CIWithCollectionExample.config;
import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dev.CIWithCollectionExample.Question;
//this is the annotation which will help us identifying 
@Configuration
public class QuestionConfig {
	@Bean
	public Question q1()
	{
		List<String> options=new ArrayList<>();
		options.add("Marie Curie and Irene Curie");
		options.add("Neils Bohr, Agge Bohr");
		options.add("Herman Emil Fischer, Hans Fischer");
		options.add("J J Thompson, George Paget Thompson");
		return new Question(1,"Which of the following is not a pair of parent and child, who have both won Nobel Prize?",options);
		
	}

}
