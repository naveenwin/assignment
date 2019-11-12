package com.singtel.assignment.model;

import com.singtel.assignment.behaviour.FlyBehaviour;
import com.singtel.assignment.behaviour.WalkBehaviour;

public class ButterFly extends Animal{

    public ButterFly(FlyBehaviour flyBehaviour, WalkBehaviour walkBehaviour){
        setFlyBehaviour(flyBehaviour);
        setWalkBehaviour(walkBehaviour);
    }
}
