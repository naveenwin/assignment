package com.singtel.assignment.model;

public class Roster extends Bird {

    private Chicken chicken;

    public Roster(){
        chicken = new Chicken();
    }

    @Override
    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }

    @Override
    public void fly() {
        chicken.fly();
    }

    @Override
    public void walk() {
        chicken.walk();
    }
}
