package com.singtel.assignment.model.bird;

import com.singtel.assignment.behaviour.SoundBehaviour;
import com.singtel.assignment.model.Bird;

public class Parrot extends Bird {

    public Parrot(SoundBehaviour soundBehaviour){
        setSoundBehaviour(soundBehaviour);
    }
}
