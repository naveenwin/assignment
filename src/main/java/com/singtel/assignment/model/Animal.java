package com.singtel.assignment.model;

import com.singtel.assignment.behaviour.*;
import com.singtel.assignment.behaviour.impl.*;

public abstract class Animal<T> {

    protected WalkBehaviour walkBehaviour;

    protected FlyBehaviour flyBehaviour;

    protected SwimBehaviour swimBehaviour;

    protected SoundBehaviour soundBehaviour;

    protected EatBehaviour eatBehaviour;

    protected JokeBehaviour jokeBehaviour;

    public Animal(){
        walkBehaviour = new NoWalkBehaviour();
        flyBehaviour = new NoFlyBehaviour();
        swimBehaviour = new NoSwimBehaviour();
        soundBehaviour = new NoSoundBehaviour();
        eatBehaviour = new NoEatBehaviour();
        jokeBehaviour = new NoJokeBehaviour();
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

    public final void eat(T t) {
        eatBehaviour.eat(t);
    }

    public final void joke() {
        jokeBehaviour.joke();
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

    public EatBehaviour getEatBehaviour() {
        return eatBehaviour;
    }

    public void setEatBehaviour(EatBehaviour eatBehaviour) {
        this.eatBehaviour = eatBehaviour;
    }

    public JokeBehaviour getJokeBehaviour() {
        return jokeBehaviour;
    }

    public void setJokeBehaviour(JokeBehaviour jokeBehaviour) {
        this.jokeBehaviour = jokeBehaviour;
    }
}
