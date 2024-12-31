package org.jsp.springIocContainerAnnotation_ConstructorInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Bike {

	private String name;
	private String color;
	private double cost;
	public Bike(@Value(value = "pulsar")String name,@Value(value = "blue") String color,@Value(value = "250000") double cost) {
		super();
		this.name = name;
		this.color = color;
		this.cost = cost;
	}

	public void bikeDetails() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
	}
}
