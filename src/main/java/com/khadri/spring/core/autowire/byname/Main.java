package com.khadri.spring.core.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("beans_byname.xml");

        Student student = context.getBean("std", Student.class);
        System.out.println(student.getAddress());

    }
}