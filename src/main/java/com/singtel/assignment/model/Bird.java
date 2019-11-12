package com.singtel.assignment.model;

import com.singtel.assignment.behaviour.SoundBehaviour;


public class Bird extends Animal implements SoundBehaviour {

    public void fly() {
        System.out.println("I am flying");
    }

    public void sing() {
        System.out.println("I am singing");
    }
}
