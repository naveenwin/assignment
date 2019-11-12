package com.singtel.assignment.model.fish;

import com.singtel.assignment.behaviour.impl.ClownFishJokeBehaviour;
import com.singtel.assignment.model.Fish;

public class ClownFish extends Fish {

    public ClownFish(){
        setJokeBehaviour(new ClownFishJokeBehaviour());
        setSize("Small");
        setColour("Orange");
    }
}
