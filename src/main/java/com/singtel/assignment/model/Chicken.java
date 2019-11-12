package com.singtel.assignment.model;

public class Chicken extends Bird {

    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }

    @Override
    public void fly() {
        System.out.println("I cant fly");
    }
}

