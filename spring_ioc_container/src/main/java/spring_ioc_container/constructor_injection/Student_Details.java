package spring_ioc_container.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
		Student student= (Student) context.getBean("mystudent");
		student.studentDetails();
	}

}
