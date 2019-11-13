package com.singtel.assignment.model.bird;

import com.singtel.assignment.behaviour.impl.ChickenSoundBehaviour;
import com.singtel.assignment.behaviour.impl.RoosterSoundBehaviour;
import com.singtel.assignment.model.Bird;

public class Roster extends Bird {

    private Chicken chicken;

    //TODO Build object using builder patter same as Chicken Class
    public Roster(){
        chicken = Chicken.builder().buildWith(new ChickenSoundBehaviour()).build();
        setFlyBehaviour(chicken.getFlyBehaviour());
        setSoundBehaviour(new RoosterSoundBehaviour());
    }

}