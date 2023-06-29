package com.khadri.spring.core.autowire.bytype;

public class Customer {

    private Order vegOrder;


    public void setVegOrder(Order vegOrder) {
        this.vegOrder = vegOrder;
    }

    public Order getVegOrder() {
        return vegOrder;
    }
}
