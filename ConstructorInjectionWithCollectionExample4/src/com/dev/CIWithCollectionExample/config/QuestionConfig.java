package com.dev.CIWithCollectionExample.config;

import java.util.List;
import java.util.ArrayList;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;


import com.dev.CIWithCollectionExample.*;
@Configuration
public class QuestionConfig {
	@Bean
	public Answer answer1()
	{
		return new Answer(1,"Messi","John");
	}
	@Bean
	public Answer answer2()
	{
		return new Answer(2,"Ronaldo","Gualter");
	}
	@Bean
	public Question question1()
	{
		List<Answer> answers=new ArrayList<>();
		answers.add(answer1());
		answers.add(answer2());
		return new Question(1,"Who is the greatest footballer of current time?",answers);
	}
	

}
