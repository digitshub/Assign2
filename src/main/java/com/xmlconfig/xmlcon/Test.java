package com.xmlconfig.xmlcon;
import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClasspathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
		Tea s1 = (Tea) context.getBean("s1");
		System.out.println(s1);
	}

}
