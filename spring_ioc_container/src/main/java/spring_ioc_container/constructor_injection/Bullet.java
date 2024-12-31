package spring_ioc_container.constructor_injection;

public class Bullet {

	private String color;
	private String cc;
	private double cost;
	public Bullet(String color, String cc, double cost) {
		super();
		this.color = color;
		this.cc = cc;
		this.cost = cost;
	}
	
	public void bulletDetails() {
		
		System.out.println(color);
		System.out.println(cc);
		System.out.println(cost);
	}
	
	
}
