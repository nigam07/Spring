package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Car;

public class Client {

	public static void main(String[] args) {
	
		String[] files = new String[]{"resources/Car.xml", "resources/Engine.xml"};
		
		ApplicationContext ap = new ClassPathXmlApplicationContext(files);
		
		Car car = (Car)ap.getBean("c");
		
		car.display();
		
	}
	
}
