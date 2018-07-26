package sp.core.beans;

import java.util.Date;

public class WishMessageGenerator {
private Date date;
public void setDate(Date date) {
	this.date=date;
}
//business method

public String generationWishMsg(String name) {
	int hour=0;
	//get current hour
	hour=date.getHours();
	if(hour<=12)
		return "GoodMorning"+name;
else if(hour<=16) 
	return "Good Afternoon"+name;
else if(hour<=20)
	return "Good Evening"+name;
else 
	return "Good night";
}

}
