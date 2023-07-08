package com.khadri.spring.core.autowire.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {

    private Order order;

    Customer(){
        System.out.println("0-arg constructor");
    }

    Customer(Order order){
        this.order=order;
        System.out.println("constructor injection");
    }

    @Qualifier("nonVeg")
    public void setOrder(Order order) {
        this.order = order;
        System.out.println("setter injection");
    }
    public Order getOrder() {
        return order;
    }


}
