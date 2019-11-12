package com.singtel.assignment.model.bird;

import com.singtel.assignment.behaviour.impl.ChickenSoundBehaviour;
import com.singtel.assignment.model.Bird;

public class Chicken extends Bird {

    public Chicken(){
        setSoundBehaviour(new ChickenSoundBehaviour());
    }
}

