package org.jsp.springIocContainerAnnotation_ConstructorInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	private String brand;
	private String color;
	private double cost;
	public Mobile(@Value(value="realme")String brand,@Value(value="blue") String color, @Value(value="18999")double cost) {
		super();
		this.brand = brand;
		this.color = color;
		this.cost = cost;
	}
	public void mobileDetails() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(cost);
	}
	
}
