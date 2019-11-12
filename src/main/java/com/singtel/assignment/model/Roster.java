package com.singtel.assignment.model;

import com.singtel.assignment.behaviour.impl.RoosterSoundBehaviour;

public class Roster extends Bird {

    private Chicken chicken;

    public Roster(){
        chicken = new Chicken();
        setFlyBehaviour(chicken.getFlyBehaviour());
        setSoundBehaviour(new RoosterSoundBehaviour());
    }

}