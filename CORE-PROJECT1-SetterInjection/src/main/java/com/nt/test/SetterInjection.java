package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;



@SuppressWarnings("deprecation")
public class SetterInjection {


	public static void main(String[] args) {
		
		Resource res=null;
		BeanFactory factory=null;
		Object  obj=null;
		WishMessageGenerator generator=null;
		
		//Location SpringBean Configuration file
		res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		
		//Create IOC container(BeanFactory)
		factory=new XmlBeanFactory(res);
		
		//Get Bean(main bean)
		obj=factory.getBean("wish");
		
		//Type Casting
		generator=(WishMessageGenerator)obj;
		
		//Invoke Business Method
		
		System.out.println("Message::"+generator.GeneratorWishMessage("Sankar"));
		
		
		

	}

}
