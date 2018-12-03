
package com.nt.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAroundAdvice implements MethodInterceptor {

	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		Object retValue=null;
		
		Object args[]=null;
		
		System.out.println("Entering into::"+invocation.getMethod().getName()+"with args"+Arrays.toString(invocation.getArguments()));
		
		//Changing value
		
		args=invocation.getArguments();
		
		if(((Float)args[0])<50000)
			
			args[2]=(Float)args[1]-0.5f;
		
		//Controlling Target method Execution
		
		if(((Float)args[0]<=0) || ((Float)args[1]<=0 || (Float)args[2]<=0)) throw new  IllegalArgumentException("Provide Valid Inputs"); 
		
		else 
		
		retValue=invocation.proceed();
		
		System.out.println("Leaving  into::"+invocation.getMethod().getName()+"with args"+Arrays.toString(invocation.getArguments()));
		
		return retValue;
	}

}
