package com.coforge.training.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.SpringDemo.model.Book;

public class BookApp {

	 public static void main( String[] args )
	    {
		 //IOC The Control of Creation of Obejcts is given to XML File
	        ApplicationContext appCon=new ClassPathXmlApplicationContext("BookConfig.xml");
	        Book factory=(Book)appCon.getBean("book1");
	        factory.show();
	        
	        //Traditional Approach of Creation of Objects
	        Book b1=new Book(11,"BalGuru Swamy",500L);
	        b1.show();
	
	    }
}
