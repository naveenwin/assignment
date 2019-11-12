package com.singtel.assignment.model;

import com.singtel.assignment.behaviour.SoundBehaviour;

public class Dog extends Animal implements SoundBehaviour {

    @Override
    public void sing() {
        System.out.println("Woof, woof");
    }
}
