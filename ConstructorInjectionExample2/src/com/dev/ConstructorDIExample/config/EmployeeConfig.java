package com.dev.ConstructorDIExample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.dev.ConstructorDIExample.*;
//what is the use of @Configuration: Indicates that a class declares one or more @Bean methods and may
//be processed by the Spring container to generate bean definitions and service requests for those 
//beans at runtime, for example: 
@Configuration
public class EmployeeConfig {
		@Bean
		public Address address(){
			return new Address("New Delhi","West Bengal","India");
		}
		@Bean
		public Employee employee(){
			return new Employee(1,"Sayak Haldar",address());
		}
}
