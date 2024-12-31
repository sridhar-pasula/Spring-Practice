package org.jsp.springIocContainerAnnotation_SetterInjecter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Paper {

	private String size;
	private String color;
	
	public String getSize() {
		return size;
	}
	@Value(value = "A4")
	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}
	@Value(value = "white")
	public void setColor(String color) {
		this.color = color;
	}

	
	
}
