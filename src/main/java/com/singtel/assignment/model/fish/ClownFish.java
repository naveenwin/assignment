package com.singtel.assignment.model.fish;

import com.singtel.assignment.behaviour.impl.ClownFishJokeBehaviour;
import com.singtel.assignment.model.Fish;

public class ClownFish extends Fish {

    //TODO Build object using builder patter same as Chicken Class
    public ClownFish(){
        setJokeBehaviour(new ClownFishJokeBehaviour());
        setSize("Small");
        setColour("Orange");
    }
}
