package com.singtel.assignment.model.bird;

import com.singtel.assignment.behaviour.SwimBehaviour;
import com.singtel.assignment.behaviour.impl.DuckSoundBehaviour;
import com.singtel.assignment.behaviour.impl.YesSwimBehaviour;
import com.singtel.assignment.model.Bird;

public class Duck extends Bird implements SwimBehaviour {

    //TODO Build object using builder patter same as Chicken Class
    public Duck(){
        setSwimBehaviour(new YesSwimBehaviour());
        setSoundBehaviour(new DuckSoundBehaviour());
    }
}
