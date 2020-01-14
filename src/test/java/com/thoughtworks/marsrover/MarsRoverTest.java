package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {
    @Test
    public void should_initialized_when_execute_InitializeCommand() {
        MarsRover marsRover = new MarsRover();
        String result = marsRover.execute(new InitializeCommand(new Location(0, 0), new NDirection()));
        assertThat(result, is("location:(0, 0), direction: N"));
    }

    @Test
    public void should_initialized_when_execute_InitializeCommand_0_1_N() {
        MarsRover marsRover = new MarsRover();
        String result = marsRover.execute(new InitializeCommand(new Location(0, 1), new NDirection()));
        assertThat(result, is("location:(0, 1), direction: N"));
    }


}
