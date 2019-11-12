package com.singtel.assignment.behaviour.impl;

import com.singtel.assignment.behaviour.JokeBehaviour;

public class NoJokeBehaviour implements JokeBehaviour {

    @Override
    public void joke() {
        System.out.println("I cant joke");
    }
}
