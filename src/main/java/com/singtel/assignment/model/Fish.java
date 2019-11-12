package com.singtel.assignment.model;

import com.singtel.assignment.behaviour.impl.YesSwimBehaviour;

public abstract class Fish<T> extends Animal<T> {

    protected String size = "UnKnown";
    protected String colour = "UnKnown";

    public Fish(){
        setSwimBehaviour(new YesSwimBehaviour());
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
