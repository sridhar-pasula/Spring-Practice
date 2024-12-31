package org.jsp.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalSound {
@Autowired
private Animal animal ;
	
	public void dosound() {
		animal.sound();
	}

	public AnimalSound(Animal animal) {
		super();
		this.animal = animal;
	}
}
