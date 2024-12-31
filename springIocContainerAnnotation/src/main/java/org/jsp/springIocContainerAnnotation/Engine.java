package org.jsp.springIocContainerAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	@Value(value="3500")
	private String hp;
	@Value(value="1200")
	private String cc;
	
	public void getEngineDetails() {
		System.out.println(hp);
		System.out.println(cc);
	}
}
