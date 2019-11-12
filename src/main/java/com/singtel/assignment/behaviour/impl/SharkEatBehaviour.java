package com.singtel.assignment.behaviour.impl;

import com.singtel.assignment.behaviour.EatBehaviour;
import com.singtel.assignment.model.Fish;
import com.singtel.assignment.model.fish.Shark;

public class SharkEatBehaviour<T extends Fish> implements EatBehaviour<T> {

    public void eat(T fish) {
        if (fish instanceof Shark) {
            System.out.println("I cant eat shark");
        } else {
            System.out.println("I am eating other fish");
        }
    }
}

