package spring_ioc_container.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("bullet.xml");
		Bullet bullet= (Bullet) context.getBean("mybullet");
		bullet.bulletDetails();
		

	}

}
