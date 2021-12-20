package com.coforge.training.crud.model;

import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="employeemng")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="email")
	private String email;
	
	
	@Column(name="desig")
	private String desig;
	
	@Column(name="emptype")
	private String emptype;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String fname, String lname, String email, String desig, String emptype) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	
		this.desig = desig;
		this.emptype = emptype;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getEmptype() {
		return emptype;
	}

	public void setEmptype(String emptype) {
		this.emptype = emptype;
	}
	
	
	
	
}
