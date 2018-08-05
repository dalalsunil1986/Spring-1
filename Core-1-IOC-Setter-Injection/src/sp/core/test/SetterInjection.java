/*
 jdk1.8 version is require
 REQUIRED JAR FILES:
 1.spring-beans
 2.spring-context
 3.spring-context-support
 4.spring-core
 5.spring-expression
 
 6.commons-logging-1.2
 
 */
package sp.core.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import sp.core.beans.WishMessageGenerator;


@SuppressWarnings("deprecation")
public class SetterInjection {
	
	public static void main(String[] args) {
		
		Resource res=null;
		
		BeanFactory factory=null;
		
		Object obj=null;
		
		WishMessageGenerator generator=null;
		
		//location SpringBean Configuration  file
		
		res=new FileSystemResource("src/se/core/cfgs/applicationContext.xml");
		
		//Create IOC container(BeanFactrory)
		
		factory=new XmlBeanFactory(res);
		
		//get Bean(Main Bean)
		
		obj=factory.getBean("wish");
		
		//type casting 
		
		generator=(WishMessageGenerator)obj;
		
		//invoke business method
		
		System.out.println("Message:::"+generator.generationWishMsg("Sankar"));
		
	}//main method

}//class
