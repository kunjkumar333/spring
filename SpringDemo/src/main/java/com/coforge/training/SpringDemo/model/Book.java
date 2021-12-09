package com.coforge.training.SpringDemo.model;

//Bean class for Dependecny Injection By Constructor
public class Book {
	
	
   
   
	private int bId;
	private String bName;
	private Long price;
	public Book() {
		System.out.println("DI using Constructor");
		
	}
	public Book(int bId, String bName, Long price) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.price = price;
	}
	public Book(int bId) {
		super();
		this.bId = bId;
	}
	public Book(String bName) {
		super();
		this.bName = bName;
	}
	public Book(Long price) {
		super();
		this.price = price;
	}
	public void show()
    {
        System.out.println(bId+ " "+bName+" "+price);
    }
	
	
	
	

}
