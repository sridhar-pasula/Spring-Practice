package spring_ioc_container.constructor_injection.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalDriver {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("animal.xml");
		AnimalSound animalSound = (AnimalSound) context.getBean("myanimal");
		animalSound.dosound();

	}

}
