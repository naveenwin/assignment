package com.singtel.assignment.model;

import com.singtel.assignment.behaviour.Swimable;

public class Duck extends Bird implements Swimable {

    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
