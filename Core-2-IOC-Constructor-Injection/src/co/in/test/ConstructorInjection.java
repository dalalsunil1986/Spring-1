/*
 jdk1.8version is require.
 
 REQUIRED JAR FILES:
 
 1.Spring-beans
 2.spring-context
 3.spring-context-support
 4.spring-core
 5.spring-expression
 
 6.commons-logging-1.2
 
 */
package co.in.test;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import co.in.beans.WishMessageGenerator;


@SuppressWarnings({ "deprecation", "unused" }) 

public class ConstructorInjection {

	public static void main(String[] args) {
		
			System.out.println("main(-)");
		
			Resource res=null;
			
			BeanFactory factory=null;
			
	
			
			Object obj=null;
			
			WishMessageGenerator generator=null;
			
				//Locate SpringBean Configuration File
			
				res=new FileSystemResource("src/co/in/cfgs/applicationContext.xml");
			
				//res=new FileSystemResource("E:/java/java programs/spring/Core-2-IOC-Constructor-Injection/src/co/in/cfgs/applicationContext.xml");//Location of file path
				
				//res=new ClassPathResource("co/in/cfgs/applicationContext.xml");
			
				//res=new ClassPathResource("applicationContext.xml");//Build path-->Configure build path--> add Class Folder
				
				//Create IOC Container
				
				factory=new XmlBeanFactory(res);
				
				//get Bean
				
				obj=factory.getBean("wish");
				
				//TypeCasting
				
					//generator=(WishMessageGenerator)obj;
				
					generator=factory.getBean("wish",WishMessageGenerator.class);
					
		//Invoke the Method 
				
		System.out.println("Result==="+generator.generateWishMessage("Sankar")); 
		
		System.out.println("\nEnd of the main(-)");
		
	}//main method

}//class
