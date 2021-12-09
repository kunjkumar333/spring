package com.coforge.training.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.SpringDemo.model.Candidate;
import com.coforge.training.SpringDemo.model.Person;

public class PersonAPp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ApplicationContext appCon=new ClassPathXmlApplicationContext("PersonConfig.xml");
	        Person factory=(Person)appCon.getBean("person1");
	        
	        System.out.println("person Details :");
	        System.out.println("Person Id :"+factory.getId());
	        System.out.println("Person name :"+factory.getName());
	        factory.showPhoneNos();
	}

}
