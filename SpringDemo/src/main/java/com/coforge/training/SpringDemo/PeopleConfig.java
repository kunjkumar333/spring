package com.coforge.training.SpringDemo;



import org.springframework.context.annotation.*;

import com.coforge.training.SpringDemo.model.People;

//Configuring Spring Bean Without XML
//DI using Setter by Annotations
/*@Configuration annotation indicates that a class declares one or more @Bean methods 
 * and may be processed by the Spring container to generate bean definitions and service
 *  requests for those beans at runtime.*/
/*The @ComponentScan annotation is used with the @Configuration annotation to tell Spring 
 * the packages to scan for annotated components.*/
@Configuration
@ComponentScan(basePackages="com.coforge.training.SpringDemo.model")
public class PeopleConfig {
 
	@Bean(name="people")
	public People getPeople() {
		
		People p=new People();
		p.setName("ROd Johnson");
		p.setAge(55);
		return p;
	}
}
