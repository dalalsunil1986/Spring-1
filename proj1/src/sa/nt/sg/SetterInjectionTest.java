package sa.nt.sg;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import sa.nt.se.WishMessageGenerator;


@SuppressWarnings("deprecation")
public class SetterInjectionTest {
	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		WishMessageGenerator generator=null;
		//location SpringBean wi file
		res=new FileSystemResource("src/s/nt/wi/applicationContext.xml");
		//Create IOC container(BeanFactrory)
		factory=new XmlBeanFactory(res);
		//get Bean(Main Bean)
		obj=factory.getBean("wish");
		//type casting 
		generator=(WishMessageGenerator)obj;
		//invoke business method
		System.out.println("Message:::"+generator.generationWishMsg("Sankar"));
		
	}

}
