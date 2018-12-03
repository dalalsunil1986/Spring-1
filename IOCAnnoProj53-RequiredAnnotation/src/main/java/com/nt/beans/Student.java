package com.nt.beans;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private int sno;
	private String sname;
	private CourseMaterial material;
	
	//@Required ---means Applied on Bean property setter methods  and that property must be configure  in XML
	
	@Required
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Required
	public void setMaterial(CourseMaterial material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", material=" + material + "]";
	}
	
	

}
