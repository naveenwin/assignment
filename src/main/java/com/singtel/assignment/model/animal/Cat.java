package com.singtel.assignment.model.animal;

import com.singtel.assignment.behaviour.impl.CatSoundBehaviour;
import com.singtel.assignment.model.Animal;

public class Cat extends Animal {

    //TODO Build object using builder patter same as Chicken Class
    public Cat() {
        setSoundBehaviour(new CatSoundBehaviour());
    }
}
