package com.xmlconfig.javacon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Client {

    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(javaconfig.class);
        Student student=context.getBean("student",Student.class);
        System.out.println(student);
        student.study();
    }


}
