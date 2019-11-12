package com.singtel.assignment.model.animal;

import com.singtel.assignment.behaviour.SoundBehaviour;
import com.singtel.assignment.behaviour.impl.DogSoundBehaviour;
import com.singtel.assignment.model.Animal;

public class Dog extends Animal implements SoundBehaviour {

    public Dog(){
        setSoundBehaviour(new DogSoundBehaviour());
    }
}
