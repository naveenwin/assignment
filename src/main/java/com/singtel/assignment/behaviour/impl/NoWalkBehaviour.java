package com.singtel.assignment.behaviour.impl;

import com.singtel.assignment.behaviour.WalkBehaviour;

public class NoWalkBehaviour implements WalkBehaviour {

    @Override
    public void walk() {
        System.out.println("I cant walk");
    }
}
