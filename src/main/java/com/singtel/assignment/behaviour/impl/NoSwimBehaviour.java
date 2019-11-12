package com.singtel.assignment.behaviour.impl;


import com.singtel.assignment.behaviour.SwimBehaviour;

public class NoSwimBehaviour implements SwimBehaviour {

    @Override
    public void swim() {
        System.out.println("I cant swim");
    }
}
