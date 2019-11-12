package com.singtel.assignment.model;

import com.singtel.assignment.behaviour.impl.ChickenSoundBehaviour;

public class Chicken extends Bird {

    public Chicken(){
        setSoundBehaviour(new ChickenSoundBehaviour());
    }
}

