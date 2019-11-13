package com.singtel.assignment.model;

import com.singtel.assignment.model.fish.ClownFish;
import com.singtel.assignment.model.fish.Dolphin;
import com.singtel.assignment.model.fish.Shark;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


//TODO Pending Negative Scenario tests
public class FishTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testFishDontSing(){
        Fish fish = new ClownFish();
        fish.sing();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("I cant sing");
    }

    @Test
    public void testFishDontWalk(){
        Fish fish = new ClownFish();
        fish.walk();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("I cant walk");
    }

    @Test
    public void testFishCanSwim(){
        Fish fish = new ClownFish();
        fish.swim();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("I am swimming");
    }

    @Test
    public void testSharkColourAndSize(){
        Fish fish = new Shark();

        Assertions.assertThat(fish.getColour()).isEqualToIgnoringNewLines("Grey");
        Assertions.assertThat(fish.getSize()).isEqualToIgnoringNewLines("Large");
    }

    @Test
    public void testClownFishColourAndSize(){
        Fish fish = new ClownFish();

        Assertions.assertThat(fish.getColour()).isEqualToIgnoringNewLines("Orange");
        Assertions.assertThat(fish.getSize()).isEqualToIgnoringNewLines("Small");
    }

    @Test
    public void testClownFishMakeJokes(){
        Fish fish = new ClownFish();
        fish.joke();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("I am joking");
    }

    @Test
    public void testSharkEatOtherFish(){
        Fish<ClownFish> fish = new Shark<>();
        fish.eat(new ClownFish());

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("I am eating other fish");
    }

    @Test
    public void testSharkEatSharkFish(){
        Fish<Shark> fish = new Shark<>();
        fish.eat(new Shark());

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("I cant eat shark");
    }

    @Test
    public void testDolphinSwim(){
        Dolphin fish = new Dolphin();
        fish.swim();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("I am swimming");
    }
}
