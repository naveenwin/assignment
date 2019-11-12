package com.singtel.assignment.model.animal;

import com.singtel.assignment.behaviour.impl.CatSoundBehaviour;
import com.singtel.assignment.model.Animal;

public class Cat extends Animal {

    public Cat() {
        setSoundBehaviour(new CatSoundBehaviour());
    }
}
