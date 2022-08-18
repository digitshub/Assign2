package com.xmlconfig.ann;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Office c= (Office)context.getBean("cd",Office.class);
        System.out.println(c);
    }
}
