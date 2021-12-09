package com.coforge.training.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.SpringDemo.model.Developer;


public class DeveloperApp {

	 public static void main( String[] args )
	    {
	        ApplicationContext appCon=new ClassPathXmlApplicationContext("DeveloperConfig.xml");
	        Developer factory=(Developer)appCon.getBean("dev1");
	        factory.display();
	
	    }
}
