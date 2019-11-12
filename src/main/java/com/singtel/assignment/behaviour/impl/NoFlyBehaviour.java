package com.singtel.assignment.behaviour.impl;

import com.singtel.assignment.behaviour.FlyBehaviour;

public class NoFlyBehaviour implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I cant fly");
    }
}
