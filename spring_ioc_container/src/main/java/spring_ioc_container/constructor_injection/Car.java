package spring_ioc_container.constructor_injection;

public class Car {

	private String name;
	private String color;
	private double cost;
	private Engine engine;
	public Car(String name, String color, double cost, Engine engine) {
		super();
		this.name = name;
		this.color = color;
		this.cost = cost;
		this.engine = engine;
	}
	
	public void carDetails() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
	    engine.engineDetails();
	}
}
