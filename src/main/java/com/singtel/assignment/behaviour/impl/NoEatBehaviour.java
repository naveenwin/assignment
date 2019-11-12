package com.singtel.assignment.behaviour.impl;

import com.singtel.assignment.behaviour.EatBehaviour;

public class NoEatBehaviour implements EatBehaviour {

    @Override
    public void eat(Object o) {
        System.out.println("I cant eat");
    }
}
