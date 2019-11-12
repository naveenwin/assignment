package com.singtel.assignment.model;

import com.singtel.assignment.behaviour.FlyBehaviour;
import com.singtel.assignment.behaviour.SoundBehaviour;
import com.singtel.assignment.behaviour.SwimBehaviour;
import com.singtel.assignment.behaviour.WalkBehaviour;
import com.singtel.assignment.behaviour.impl.NoFlyBehaviour;
import com.singtel.assignment.behaviour.impl.NoSoundBehaviour;
import com.singtel.assignment.behaviour.impl.NoSwimBehaviour;
import com.singtel.assignment.behaviour.impl.NoWalkBehaviour;

public class Animal {

    private WalkBehaviour walkBehaviour;

    private FlyBehaviour flyBehaviour;

    private SwimBehaviour swimBehaviour;

    private SoundBehaviour soundBehaviour;

    Animal(){
        walkBehaviour = new NoWalkBehaviour();
        flyBehaviour = new NoFlyBehaviour();
        swimBehaviour = new NoSwimBehaviour();
        soundBehaviour = new NoSoundBehaviour();
    }

    public final void walk(){
        walkBehaviour.walk();
    }

    public final void swim(){
        swimBehaviour.swim();
    }

    public final void sing(){
        soundBehaviour.sing();
    }

    public final void fly() {
        flyBehaviour.fly();
    }

    public void setWalkBehaviour(WalkBehaviour walkBehaviour) {
        this.walkBehaviour = walkBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }

    public void setSoundBehaviour(SoundBehaviour soundBehaviour) {
        this.soundBehaviour = soundBehaviour;
    }

    public WalkBehaviour getWalkBehaviour() {
        return walkBehaviour;
    }

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public SwimBehaviour getSwimBehaviour() {
        return swimBehaviour;
    }

    public SoundBehaviour getSoundBehaviour() {
        return soundBehaviour;
    }
}
