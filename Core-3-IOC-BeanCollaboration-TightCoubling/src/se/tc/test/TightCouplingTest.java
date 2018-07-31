
/*
 jdk1.8 version  is require.
 
 REQUIRED JAR FILES:
 
 1.Spring-beans
 2.spring-context
 3.spring-context-support
 4.spring-core
 5.spring-expression
 
 6.commons-logging-1.2
 
 */
package se.tc.test;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.ClassPathResource;

import be.tc.beans.Flipkart;

public class TightCouplingTest {
	
	public static void main(String[] agrs) {
		
		BeanFactory factory=null;
		
		Flipkart fpkt=null;
		
		//Create IOC Container
		
		factory=new XmlBeanFactory(new ClassPathResource("be/tc/cfgs/applicationContext.xml"));
		
		//Get Target Class Object
		
		fpkt=factory.getBean("fpkt",Flipkart.class);
		
		//invoke the method
		
		System.out.println(fpkt.shopping(new String[] {"\n\nBig Laddu","\n\nBig Murthi","\n\npuja Items","\n\nprasad items","\n\nDecoration items\n\n"}));
		
	}// main method 

}//class
