package com.singtel.assignment.model;

import com.singtel.assignment.behaviour.impl.NoFlyBehaviour;
import com.singtel.assignment.behaviour.impl.YesFlyBehaviour;
import com.singtel.assignment.behaviour.impl.YesWalkBehaviour;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

//TODO Pending Negative Scenario tests
public class ButterflyTest {

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
    public void testButterFlyCanFly() {
        ButterFly butterFly = new ButterFly(new YesFlyBehaviour(), new YesWalkBehaviour());
        butterFly.fly();
        butterFly.walk();
        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("I am flying" + System.lineSeparator() + "I am walking");
    }

    @Test
    public void testCatterpillarCantFlyAndWalk() {
        ButterFly catterpillar = new ButterFly(new NoFlyBehaviour(), new YesWalkBehaviour());
        catterpillar.fly();
        catterpillar.walk();
        Assertions.assertThat(outContent.toString()).isEqualToIgnoringNewLines("I cant fly" + System.lineSeparator() + "I am walking");
    }

}
