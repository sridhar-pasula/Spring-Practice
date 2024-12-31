package org.jsp.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalDriver {
	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		AnimalSound animalSound = context.getBean(AnimalSound.class,"animal");
		animalSound.dosound();

	}

}
