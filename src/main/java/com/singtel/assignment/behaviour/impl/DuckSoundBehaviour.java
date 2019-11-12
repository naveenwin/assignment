package com.singtel.assignment.behaviour.impl;

import com.singtel.assignment.behaviour.SoundBehaviour;

public class DuckSoundBehaviour implements SoundBehaviour {

    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }
}
