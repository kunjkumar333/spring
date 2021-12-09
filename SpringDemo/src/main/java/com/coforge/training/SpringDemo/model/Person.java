package com.coforge.training.SpringDemo.model;

import java.util.Map;
import java.util.Map.Entry;



public class Person {

	private int id;
    private String name;
    private Map<String, String> phoneNos;
	public Person(int id, String name, Map<String, String> phoneNos) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNos = phoneNos;
	}
    
	public void showPhoneNos(){
	    for (Entry<String, String> entry : phoneNos.entrySet()) {
	        System.out.println(entry.getKey()+"-->"+entry.getValue());
	    }   
	    
	    
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
