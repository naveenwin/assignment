package com.singtel.assignment.behaviour.impl;

import com.singtel.assignment.behaviour.SoundBehaviour;

public class RoosterSoundBehaviour implements SoundBehaviour {

    @Override
    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }
}
