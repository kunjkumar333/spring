package com.coforge.training.SpringDemo.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext appCon=new ClassPathXmlApplicationContext("CountryConfig.xml");
	        Country factory=(Country)appCon.getBean("myCountry");
	        System.out.println(factory);
	}

}
