package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {
    @Test
    public void should_initialized_when_execute_InitializeCommand() {
        MarsRover marsRover = new MarsRover();
        String result = marsRover.execute(new InitializeCommand(new Location(0, 0), new NDirection()));
        assertThat(result, is(expected(0, 0, "N")));
    }

    private String expected(int x, int y, String direction) {
        return String.format("location:(%d, %d), direction: %s", x, y, direction);
    }

    @Test
    public void should_initialized_when_execute_InitializeCommand_0_1_N() {
        MarsRover marsRover = new MarsRover();
        String result = marsRover.execute(new InitializeCommand(new Location(0, 1), new NDirection()));
        assertThat(result, is(expected(0, 1, "N")));
    }

    @Test
    public void should_be_W_when_turn_left_and_given_N() {
        MarsRover marsRover = new MarsRover();
        marsRover.execute(new InitializeCommand(new Location(0,0), new NDirection()));

        String result = marsRover.execute(new TurnLeftCommand());

        assertThat(result, is(expected(0, 0, "W")));
    }

    @Test
    public void should_be_E_when_turn_right_and_given_N() {
        MarsRover marsRover = new MarsRover();
        marsRover.execute(new InitializeCommand(new Location(0,0), new NDirection()));

        String result = marsRover.execute(new TurnRightCommand());

        assertThat(result, is(expected(0, 0, "E")));
    }

    @Test
    public void should_be_N_when_turn_left_and_given_E() {
        MarsRover marsRover = new MarsRover();
        marsRover.execute(new InitializeCommand(new Location(0,0), new EDirection()));

        String result = marsRover.execute(new TurnLeftCommand());

        assertThat(result, is(expected(0, 0, "N")));
    }
}
