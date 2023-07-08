package com.khadri.spring.core.autowire.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_bytype_qualifier.xml");

        Customer cust = context.getBean("cust", Customer.class);
        System.out.println(cust.getOrder().getName());
    }
}
