package org.jsp.springIocContainerAnnotation_ConstructorInjection;

import org.jsp.springIocContainerAnnotation.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_Driver {
	public static void main(String[] args) {
		ApplicationContext context  = new ClassPathXmlApplicationContext("springConfig.xml");	
		Student student= context.getBean(Student.class,"mystudent");
		student.studentDetails();

	}
}
