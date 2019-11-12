package com.singtel.assignment.behaviour.impl;

import com.singtel.assignment.behaviour.WalkBehaviour;

public class YesWalkBehaviour implements WalkBehaviour {

    @Override
    public void walk() {
        System.out.println("I am walking");
    }
}
