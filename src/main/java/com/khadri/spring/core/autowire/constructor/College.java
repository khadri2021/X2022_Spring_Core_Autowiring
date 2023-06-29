package com.khadri.spring.core.autowire.constructor;

public class College {
    private Professor professor;

    College(Professor professor){
        this.professor =professor;
    }

    public Professor getProfessor() {
        return professor;
    }
}
