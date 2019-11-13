package com.singtel.assignment.behaviour;

import com.singtel.assignment.behaviour.impl.NoFlyBehaviour;
import com.singtel.assignment.behaviour.impl.NoSoundBehaviour;
import com.singtel.assignment.behaviour.impl.NoSwimBehaviour;
import com.singtel.assignment.behaviour.impl.NoWalkBehaviour;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class BehaviourFactory {

    Map<String, Behaviour> behaviours = Map.of("fly", new NoFlyBehaviour(), "walk", new NoWalkBehaviour(), "sing", new NoSoundBehaviour(), "swim", new NoSwimBehaviour());

    public Behaviour getNoBehaviour(String behaviour){
       return behaviours.get(behaviour);
    }
}
