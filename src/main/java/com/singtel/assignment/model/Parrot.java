package com.singtel.assignment.model;

import com.singtel.assignment.behaviour.SoundBehaviour;

public class Parrot extends Bird {

    private SoundBehaviour soundBehaviour;

    public Parrot(SoundBehaviour soundBehaviour){
        this.soundBehaviour = soundBehaviour;
    }

    @Override
    public void sing() {
        soundBehaviour.sing();
    }
}
