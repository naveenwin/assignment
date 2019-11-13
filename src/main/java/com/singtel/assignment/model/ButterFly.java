package com.singtel.assignment.model;

import com.singtel.assignment.behaviour.FlyBehaviour;
import com.singtel.assignment.behaviour.WalkBehaviour;

public class ButterFly extends Animal{

    //TODO Build object using builder patter same as Chicken Class
    public ButterFly(FlyBehaviour flyBehaviour, WalkBehaviour walkBehaviour){
        setFlyBehaviour(flyBehaviour);
        setWalkBehaviour(walkBehaviour);
    }
}
