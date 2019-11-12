package com.singtel.assignment.model;

import com.singtel.assignment.behaviour.SoundBehaviour;

public class Cat extends Animal implements SoundBehaviour {

    @Override
    public void sing() {
        System.out.println("Meow");
    }
}
