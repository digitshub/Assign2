package com.xmlconfig.xmlcon;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		Tea s1 = (Tea) context.getBean("s1");
		System.out.println(s1);
	}

}
