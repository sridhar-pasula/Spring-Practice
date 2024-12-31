package spring_ioc_container.constructor_injection.assignment;

public class AnimalSound {

	private Animal animal ;
	
	public void dosound() {
		animal.sound();
	}

	public AnimalSound(Animal animal) {
		super();
		this.animal = animal;
	}
	
	
}
