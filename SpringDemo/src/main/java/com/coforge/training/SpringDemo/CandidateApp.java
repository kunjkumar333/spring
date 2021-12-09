package com.coforge.training.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.SpringDemo.model.Candidate;

public class CandidateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ApplicationContext appCon=new ClassPathXmlApplicationContext("CandidateConfig.xml");
	        Candidate factory=(Candidate)appCon.getBean("cd1");
	        factory.display();
	}

}
