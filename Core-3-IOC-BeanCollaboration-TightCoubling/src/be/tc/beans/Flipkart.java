package be.tc.beans;

import java.util.Arrays;

import java.util.Random;

public class Flipkart {
	
	private DTDC dtdc;
	
		public void setDtdc(DTDC dtdc) {
		
			this.dtdc=dtdc;
		
		}//setDtdc
	
			public String shopping(String[] items) {
				
				int billAmt=0;
				
				int old=0;
				
				//Shopping and Billing Login
				
				billAmt=items.length*1000;
				
				//Generate Random Id
				
				old=new Random().nextInt(100000);
				
				//Use Countries to Delivery Product
				
				dtdc.deliver(old);
		
				return old+"\t::Order Id Order Items are "+Arrays.toString(items)+"and Bill Amount:: "+billAmt;
		
			}//shopping method

}//class
