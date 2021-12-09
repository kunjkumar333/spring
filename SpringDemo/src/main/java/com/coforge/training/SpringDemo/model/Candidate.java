package com.coforge.training.SpringDemo.model;

//Constructor Injection With Dependent Object of Addres
//Lossely Coupled Class
public class Candidate {

	private int id;
    private String name;
    
    //Aggregation
    private Address a;
    private Candidate() {
    	System.out.println("candidate details: ");
    }
	public Candidate(int id, String name, Address a) {
		super();
		this.id = id;
		this.name = name;
		this.a = a;
	}

	public void display()
    {
        System.out.println(id+" "+name);
        System.out.println(a);  // invoke toString() method of Address class
    }
   
    
}
