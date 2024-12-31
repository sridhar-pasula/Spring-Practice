package org.jsp.springIocContainerAnnotation_ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	
	private String name;
	private String gender;
	private String college;
	private double percentage;
	
	private Bike bike;
	private Laptop laptop;
	
	@Autowired // can also written here instead of writing each time for non primitive
	public Student(@Value(value = "sridhar") String name,@Value(value = "male") String gender, @Value(value = "MRCE")String college,@Value(value = "96.1") double percentage, Bike bike, Laptop laptop) {
		super();
		this.name = name;
		this.gender = gender;
		this.college = college;
		this.percentage = percentage;
		this.bike = bike;
		this.laptop = laptop;
	}
	
	public void studentDetails() {
		System.out.println("***********Student Details************");
		System.out.println(name);
		System.out.println(gender);
		System.out.println(college);
		System.out.println(percentage);
		System.out.println("***********Laptop Details************");
		laptop.getlaptopDetails();
		System.out.println("***********Bike details***********");
		bike.bikeDetails();
		
	}

	

}
