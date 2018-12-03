package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}
	
	//Business Method
	
	@SuppressWarnings("deprecation")
	public String GeneratorWishMessage(String name) {
		
		int hour=0;
		
		//Get Current Hour
		hour=date.getHours();
		
		if(hour<=12)
			return "Good Morning::"+name;
		else if(hour<=16)
			return "Good After Noon::"+name;
		else if(hour<=20)
			return "Good Evening::"+name;
		else			
		return "Good Night::"+name;
		
	}
	
	
}
