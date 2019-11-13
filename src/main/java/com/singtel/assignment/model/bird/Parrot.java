package com.singtel.assignment.model.bird;

import com.singtel.assignment.behaviour.SoundBehaviour;
import com.singtel.assignment.model.Bird;

public class Parrot extends Bird {

    //TODO Build object using builder patter same as Chicken Class
    public Parrot(SoundBehaviour soundBehaviour){
        setSoundBehaviour(soundBehaviour);
    }

}
