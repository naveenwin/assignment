package com.singtel.assignment.model;

import com.singtel.assignment.behaviour.SoundBehaviour;
import com.singtel.assignment.behaviour.impl.DogSoundBehaviour;

public class Dog extends Animal implements SoundBehaviour {

    Dog(){
        setSoundBehaviour(new DogSoundBehaviour());
    }
}
