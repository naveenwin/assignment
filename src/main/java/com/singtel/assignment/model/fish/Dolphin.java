package com.singtel.assignment.model.fish;

import com.singtel.assignment.behaviour.impl.YesSwimBehaviour;
import com.singtel.assignment.model.Animal;

public class Dolphin extends Animal {

    public Dolphin(){
        setSwimBehaviour(new YesSwimBehaviour());
    }
}
