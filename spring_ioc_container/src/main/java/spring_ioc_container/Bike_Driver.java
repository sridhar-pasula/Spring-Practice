package spring_ioc_container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Bike_Driver {

	public static void main(String[] args) {
		// jee container
//		ApplicationContext context = new ClassPathXmlApplicationContext("bike.xml");
//		Bike bike=(Bike) context.getBean("mybike");
//		bike.start();
//		bike.stop();

		// bean factory 
		Resource resource= new ClassPathResource("bike.xml");
		
		BeanFactory factory= new XmlBeanFactory(resource);
		Bike bike=(Bike)factory.getBean("mybike");
	    bike.start();
	    bike.stop();
	}
	

}
