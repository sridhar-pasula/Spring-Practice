package spring_ioc_container.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car_Engine_Driver {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("engine.xml");
		Car car = (Car) context.getBean("myCarEngine");
		car.carDetails();
	}
}
