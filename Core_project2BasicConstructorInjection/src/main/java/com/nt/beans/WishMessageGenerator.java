package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;

	public WishMessageGenerator(Date date) {
		
		this.date = date;
		
		System.out.println("WishMessageGenerator::1-parameter constructor");
		
	}

	public void setDate(Date date) {
		
		this.date = date;
		
		System.out.println("WishMessageGenerator::setDate(-) method");
	}
	
	
	@SuppressWarnings("deprecation")
	public String generateWishMessage(String user) {
		
		int hour =0;
		
		//Get current hour of the day
		
		System.out.println("Injected Date value::"+date);
		
		hour=date.getHours();
		
		if(hour<12)
			
			return "GOOD MORNING::  "+user;
		
		else if(hour<16)
			
			return "GOOD AFTER NOON::  "+user;
		
		else if(hour<20)
			
			return "GOOD EVENING::  "+user;
		
		return "GOOD NIGHT:: "+user;
	}
	
	
	

}
