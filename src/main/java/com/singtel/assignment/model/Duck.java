package com.singtel.assignment.model;

import com.singtel.assignment.behaviour.SwimBehaviour;
import com.singtel.assignment.behaviour.impl.DuckSoundBehaviour;
import com.singtel.assignment.behaviour.impl.YesSwimBehaviour;

public class Duck extends Bird implements SwimBehaviour {

    public Duck(){
        setSwimBehaviour(new YesSwimBehaviour());
        setSoundBehaviour(new DuckSoundBehaviour());
    }
}
