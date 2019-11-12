package com.singtel.assignment.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
    public void testBirdWalk() {
        Bird bird = new Bird();
        bird.walk();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("I am walking");
    }

    @Test
    public void testBirdSing() {
        Bird bird = new Bird();
        bird.sing();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("I am singing");
    }

    @Test
    public void testBirdFly() {
        Bird bird = new Bird();
        bird.fly();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("I am flying");
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
        Bird bird = new Chicken();
        bird.sing();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("Cluck, cluck");
    }

    @Test
    public void testChickenCannotFly() {
        Bird bird = new Chicken();
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
        Bird bird = new Parrot(new Roster());
        bird.sing();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("Cock-a-doodle-doo");
    }

    @Test
    public void testParrotWithDog() {
        Bird bird = new Parrot(new Dog());
        bird.sing();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("Woof, woof");
    }

    @Test
    public void testParrotWithCat() {
        Bird bird = new Parrot(new Cat());
        bird.sing();

        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("Meow");
    }
}