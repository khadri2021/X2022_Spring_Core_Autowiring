package com.khadri.spring.core.autowire.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_byconstructor.xml");

        College college = context.getBean("college", College.class);
        System.out.println(college.getProfessor());
    }
}
