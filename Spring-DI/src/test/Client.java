package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client {

	public static void main(String[] args) {
		
		/*Finding XML File*/
		Resource r = new ClassPathResource("resources/spring.xml");
		
		/*Loading XML file into container*/
		BeanFactory beanFactory= new XmlBeanFactory(r);
		
		/*Creating Object*/
		Object o = beanFactory.getBean("t");
		Test t = (Test)o;
		t.hello("Atul");
		
	}
	
}
