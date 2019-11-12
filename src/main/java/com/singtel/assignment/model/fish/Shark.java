package com.singtel.assignment.model.fish;

import com.singtel.assignment.behaviour.impl.SharkEatBehaviour;
import com.singtel.assignment.model.Fish;

public class Shark<T extends Fish> extends Fish<T> {

    public Shark(){
        setEatBehaviour(new SharkEatBehaviour());
        setSize("Large");
        setColour("Grey");
    }
}
