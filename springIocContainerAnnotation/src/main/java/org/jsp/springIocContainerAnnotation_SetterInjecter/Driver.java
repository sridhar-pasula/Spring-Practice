package org.jsp.springIocContainerAnnotation_SetterInjecter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("springConfig.xml");
		Book book=context.getBean(Book.class, "mybook");
		System.out.println(book.getName());
		System.out.println(book.getAuthor());
		System.out.println(book.getCost());
		System.out.println(book.getPaper().getSize());
		System.out.println(book.getPaper().getColor());
		
	}

}
