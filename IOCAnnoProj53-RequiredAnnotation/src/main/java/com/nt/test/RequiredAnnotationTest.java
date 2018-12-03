package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Student;

public class RequiredAnnotationTest {

	public static void main(String[] args) {
<<<<<<< HEAD
		ApplicationContext ctx=null;
		Student st=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Target Bean class object
		st=ctx.getBean("stud",Student.class);
		System.out.println(st);
		
		
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
=======
		
		
		ApplicationContext ctx=null;
		
		Student st=null;
		
		//Create IOC Container
		
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//Get Target Bean Class Object
		
		st=ctx.getBean("stud",Student.class);
		
		System.out.println(st);
		
		//Close container
		
		((AbstractApplicationContext) ctx).close();

	}

}
>>>>>>> refs/remotes/origin/master
