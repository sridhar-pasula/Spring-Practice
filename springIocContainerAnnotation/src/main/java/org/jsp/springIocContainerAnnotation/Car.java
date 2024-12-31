package org.jsp.springIocContainerAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Value(value="bmw")
	private String brand;
	@Value(value="nano")
	private String model;
	@Value(value="987678")
	private double price;
	
	@Autowired
	private Engine engine;
	
	
	public void getCarDetails(){
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
		engine.getEngineDetails();
	}
}
