package org.jsp.animal;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("meow meow");
	}
}

