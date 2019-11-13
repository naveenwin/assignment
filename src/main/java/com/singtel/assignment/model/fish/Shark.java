package com.singtel.assignment.model.fish;

import com.singtel.assignment.behaviour.impl.SharkEatBehaviour;
import com.singtel.assignment.model.Fish;

public class Shark<T extends Fish> extends Fish<T> {

    //TODO Build object using builder patter same as Chicken Class
    public Shark(){
        setEatBehaviour(new SharkEatBehaviour());
        setSize("Large");
        setColour("Grey");
    }
}
