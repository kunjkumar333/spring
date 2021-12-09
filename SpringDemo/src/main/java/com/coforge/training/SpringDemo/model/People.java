package com.coforge.training.SpringDemo.model;

import org.springframework.stereotype.Component;

//Setter Injection With the help of Annotation
@Component
public class People {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void display()
    {
        System.out.println("*********** Person Details **************");
        System.out.println(name+ " is "+age+ " old.");
    }
	

}
