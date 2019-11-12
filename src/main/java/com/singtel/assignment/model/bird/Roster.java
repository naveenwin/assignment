package com.singtel.assignment.model.bird;

import com.singtel.assignment.behaviour.impl.RoosterSoundBehaviour;
import com.singtel.assignment.model.Bird;

public class Roster extends Bird {

    private Chicken chicken;

    public Roster(){
        chicken = new Chicken();
        setFlyBehaviour(chicken.getFlyBehaviour());
        setSoundBehaviour(new RoosterSoundBehaviour());
    }

}