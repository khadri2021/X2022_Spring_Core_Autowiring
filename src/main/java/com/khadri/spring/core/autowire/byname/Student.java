package com.khadri.spring.core.autowire.byname;

public class Student {

    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}

