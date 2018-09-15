package com.nt.test;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;


import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;


@SuppressWarnings("deprecation")
public class ConstructorInjectionTest {

	public static void main(String[] args) {
		
		System.out.println("main(-)");
		
		Resource res=null;
		
		BeanFactory factory=null;
		
		WishMessageGenerator generator=null;
		
		Object obj=null;
		
		//Locate SpringBean configuration  file
		
		res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		
		//create IOC container
		
		factory=new XmlBeanFactory(res);
		
		//get Bean
		
		obj=factory.getBean("wish");
		
		//typecasting
		
		generator=(WishMessageGenerator)obj;
		
		generator=factory.getBean("wish",WishMessageGenerator.class);
		
		//invoke the method
		
		System.out.println("Result==="+generator.generateWishMessage("Sankar"));
		
		System.out.println("end of main(-)");
		
	}//main
	
}//class
