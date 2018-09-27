package com.nt.beans;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	private int sno;
	
	private String name;
	
	private CourseMaterial material;

	@Required
	public void setSno(int sno) {
		this.sno = sno;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	
	public void setMaterial(CourseMaterial material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "College [sno=" + sno + ", name=" + name + ", material=" + material + "]";
	}
	
	//@Required ---means Applied on Bean property setter methods  and that property must be configure  in XML

}
