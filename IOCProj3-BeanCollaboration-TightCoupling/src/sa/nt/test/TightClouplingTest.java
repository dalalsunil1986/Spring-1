package sa.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import sa.nt.beans.Flipkart;

public class TightClouplingTest {
	public static void main(String[] args) {
		BeanFactory factory=null;
		Flipkart fpkt=null;
	  //create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("sa/nt/cfgs/applicationContext.xml"));
	  //get Target class obj
		fpkt=factory.getBean("fpkt",Flipkart.class);
		//invoke the method
		System.out.println(fpkt.shopping(new String[]{"Big Laddu","Big Murthi","puja items","prasad items","decoration items"}));
		

	}//main
}
