package com.coforge.training.SpringDemo.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Country {

	private String capitalName;
	@Autowired
	private Capital capital;
	
	public String getCapitalName() {
		return capitalName;
	}
	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}
	public Capital getCapital() {
		return capital;
	}
	public void setCapital(Capital capital) {
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "Country [capitalName=" + capitalName + ", capital=" + capital + "]";
	}
	
	
}
