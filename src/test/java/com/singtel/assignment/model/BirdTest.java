package com.singtel.assignment.model;

import com.singtel.assignment.behaviour.impl.CatSoundBehaviour;
import com.singtel.assignment.behaviour.impl.ChickenSoundBehaviour;
import com.singtel.assignment.behaviour.impl.DogSoundBehaviour;
import com.singtel.assignment.behaviour.impl.RoosterSoundBehaviour;
import com.singtel.assignment.model.bird.Chicken;
import com.singtel.assignment.model.bird.Duck;
import com.singtel.assignment.model.bird.Parrot;
import com.singtel.assignment.model.bird.Roster;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

//TODO Pending Negative Scenario tests
public class BirdTest {

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
    public void testDuckSing() {
        Bird bird = new Duck();
        bird.sing();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("Quack, quack");
    }

    @Test
    public void testDuckSwim() {
        Duck bird = new Duck();
        bird.swim();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("I am swimming");
    }

    @Test
    public void testChickenSing() {
        Bird bird = Chicken.builder().buildWith(new ChickenSoundBehaviour()).build();
        bird.sing();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("Cluck, cluck");
    }

    @Test
    public void testChickenCannotFly() {
        Bird bird = Chicken.builder().buildWith(new ChickenSoundBehaviour()).build();
        bird.fly();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("I cant fly");
    }

    @Test
    public void testRoasterSing(){

        Bird bird = new Roster();
        bird.sing();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("Cock-a-doodle-doo");
    }

    @Test
    public void testRosterCannotFly() {
        Bird bird = new Roster();
        bird.fly();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("I cant fly");
    }

    @Test
    public void testParrotWithRoster() {
        Bird bird = new Parrot(new RoosterSoundBehaviour());
        bird.sing();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("Cock-a-doodle-doo");
    }

    @Test
    public void testParrotWithDog() {
        Bird bird = new Parrot(new DogSoundBehaviour());
        bird.sing();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("Woof, woof");
    }

    @Test
    public void testParrotWithCat() {
        Bird bird = new Parrot(new CatSoundBehaviour());
        bird.sing();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("Meow");
    }
}