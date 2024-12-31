package org.jsp.springIocContainerAnnotation_ConstructorInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Laptop {
	private String brand;
	private String processor;
	private int ram;
	public Laptop(@Value(value = "hp")String brand,@Value(value = "ryzen 7") String processor, @Value(value = "16")int ram) {
		super();
		this.brand = brand;
		this.processor = processor;
		this.ram = ram;
	}
	
	public void getlaptopDetails() {
		System.out.println(brand);
		System.out.println(processor);
		System.out.println(ram);
	}
	
	

}
