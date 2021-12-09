package com.coforge.training.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.SpringDemo.model.Pupil;

public class PupilApp {

	public static void main(String[] args) {
		 ApplicationContext appCon=new ClassPathXmlApplicationContext("PupilConfig.xml");
	        Pupil factory=(Pupil)appCon.getBean("pupil1");
	        
	        System.out.println("person Details :");
	        System.out.println("Person Id :"+factory.getId());
	        System.out.println("Person name :"+factory.getName());
	        factory.showHobbies();

	}

}
