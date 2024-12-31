package org.jsp.springIocContainerAnnotation_SetterInjecter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

	private String name;
	private String author;
	private double cost;
	
	private Paper paper;
	
	public String getName() {
		return name;
	}
	@Value(value = "money money")
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	@Value(value = "arman")
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getCost() {
		return cost;
	}
	@Value(value = "349.0")
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public Paper getPaper() {
		return paper;
	}
	@Autowired
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	
}
