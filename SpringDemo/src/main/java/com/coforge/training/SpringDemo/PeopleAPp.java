package com.coforge.training.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.coforge.training.SpringDemo.model.People;


public class PeopleAPp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext appCon=new AnnotationConfigApplicationContext(PeopleConfig.class);
		People factory = appCon.getBean("people",People.class);
        factory.display();
	}

}
