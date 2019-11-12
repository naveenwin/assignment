package com.singtel.assignment.behaviour.impl;

import com.singtel.assignment.behaviour.SoundBehaviour;

public class NoSoundBehaviour implements SoundBehaviour {

    @Override
    public void sing() {
        System.out.println("I cant sing");
    }
}
