package com.nt.test;

import java.lang.reflect.Method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IntrAmtCalculator;

public class AroundAdviceTest {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx=null;
		
		IntrAmtCalculator proxy=null;
		
		//create IOC container
		
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//Gete Proxy Object
		
		proxy=ctx.getBean("pfb",IntrAmtCalculator.class);
		
		System.out.println("Proxy Object classname::"+proxy.getClass().getSuperclass());
		
		//Invoke Business method
		
		System.out.println("Interest Amount (Simple)::"+proxy.calcSimpleIntrAmt(1000000, 2, 12));
		
		Method methods[]=proxy.getClass().getDeclaredMethods();
		
		
		for(Method m:methods) {
			
			System.out.println(m.getName());
		}
		
		//Close container
		
		((AbstractApplicationContext) ctx).close();

	}

}
