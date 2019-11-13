package com.singtel.assignment.service;

import com.singtel.assignment.behaviour.BehaviourFactory;
import com.singtel.assignment.behaviour.impl.ChickenSoundBehaviour;
import com.singtel.assignment.behaviour.impl.RoosterSoundBehaviour;
import com.singtel.assignment.behaviour.impl.YesFlyBehaviour;
import com.singtel.assignment.behaviour.impl.YesWalkBehaviour;
import com.singtel.assignment.model.Animal;
import com.singtel.assignment.model.ButterFly;
import com.singtel.assignment.model.animal.Cat;
import com.singtel.assignment.model.animal.Dog;
import com.singtel.assignment.model.bird.Chicken;
import com.singtel.assignment.model.bird.Duck;
import com.singtel.assignment.model.bird.Parrot;
import com.singtel.assignment.model.bird.Roster;
import com.singtel.assignment.model.fish.ClownFish;
import com.singtel.assignment.model.fish.Dolphin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.stream.Stream;


@Service
public class AnimalService {

    @Autowired
    private BehaviourFactory behaviourFactory;

    List<Animal> animals = List.of(new Duck(),
            Chicken.builder().buildWith(new ChickenSoundBehaviour()).build(),
            new Roster(),
            new Parrot(new RoosterSoundBehaviour()),
            new ClownFish(),
            new Dolphin(),
            new Dog(),
            new Cat(),
            new ButterFly(new YesFlyBehaviour(), new YesWalkBehaviour()));

    public Stream<Animal> getAnimals(String behaviour) {
        return animals.stream()
                .filter(a -> {
                    if (behaviour.equalsIgnoreCase("fly")) {
                        return !behaviourFactory.getNoBehaviour(behaviour).getClass().equals(a.getFlyBehaviour().getClass());
                    }
                    if (behaviour.equalsIgnoreCase("walk")) {
                        return !behaviourFactory.getNoBehaviour(behaviour).getClass().equals(a.getWalkBehaviour().getClass());
                    }
                    if (behaviour.equalsIgnoreCase("sing")) {
                        return !behaviourFactory.getNoBehaviour(behaviour).getClass().equals(a.getSoundBehaviour().getClass());
                    }
                    if (behaviour.equalsIgnoreCase("swim")){
                        return !behaviourFactory.getNoBehaviour(behaviour).getClass().equals(a.getSwimBehaviour().getClass());
                    }
                    return false;
                });
    }
}