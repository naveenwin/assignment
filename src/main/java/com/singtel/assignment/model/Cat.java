package com.singtel.assignment.model;

import com.singtel.assignment.behaviour.impl.CatSoundBehaviour;

public class Cat extends Animal {

    public Cat() {
        setSoundBehaviour(new CatSoundBehaviour());
    }
}
