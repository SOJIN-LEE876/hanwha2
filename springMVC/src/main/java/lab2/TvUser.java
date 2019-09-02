package lab2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TvUser {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lab2.xml"); 
		
		//Resource resource = new ClassPathResource("lab2.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		
		//TV tv = (TV) context.getBean("ltv");

		TV tv = context.getBean("ltv",TV.class);
		tv.powerOn();
		tv.powerOff();
	}

}
