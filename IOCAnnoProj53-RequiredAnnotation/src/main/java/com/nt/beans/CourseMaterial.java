package com.nt.beans;

import org.springframework.beans.factory.annotation.Required;

//note::@Required is used to configure bean properties fields ....that fields must and should configure in XML file otherwise throws error

public class CourseMaterial {

	private String name;
	
	private String pagesCount;

	public void setName(String name) {
		
		this.name = name;
		
	}

	@Required
	public void setPagesCount(String pagesCount) {
		
		this.pagesCount = pagesCount;
		
	}

	@Override
	
	public String toString() {
		
		return "CourseMaterial [name=" + name + ", pagesCount=" + pagesCount + "]";
		
	}
	
}
