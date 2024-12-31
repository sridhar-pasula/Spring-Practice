package org.jsp.springIocContainerAnnotation;

import org.jsp.springIocContainerAnnotation_ConstructorInjection.Mobile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context  = new ClassPathXmlApplicationContext("springConfig.xml");
		Car car=context.getBean(Car.class,"myCar");
		car.getCarDetails();
		
		Mobile mobile= context.getBean(Mobile.class,"myMobile");
		mobile.mobileDetails();

	}

}
