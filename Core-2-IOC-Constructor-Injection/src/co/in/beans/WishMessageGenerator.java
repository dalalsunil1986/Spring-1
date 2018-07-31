package co.in.beans;

import java.util.Date;

public class WishMessageGenerator{
	
	private Date date;

		public WishMessageGenerator(Date date) {
		
			this.date=date;
		
			System.out.println("WishMessageGenerator:::1-parameter Constuctor\n");
	
		}// Constructor

			public void setDate(Date date) {
		
				this.date = date;
		
				System.out.println("WishMessageGenerator:::setDate(-) method\n");
		
			}//setDate method
	
	
					public String generateWishMessage(String user) {
		
						int hour=0;
		
						//get Current Hour of the day
		
						System.out.println("Injected Date value::\t\t"+user+"\n");
		
						hour=date.getHours();
		
							if(hour<12)
			
								return "Good Morning::\t\t"+user;
		
							else if(hour<16)
			
								return "Good AfterNoon::\t\t"+user;
		
							else if(hour<20)
			
								return "Good Evening::\t\t"+user;
		
							else
			
								return "Good Night::\t\t"+user;
		
		
					}//generateWishMessage method
	
	
}//class