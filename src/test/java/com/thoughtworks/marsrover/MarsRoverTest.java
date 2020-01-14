package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {
    @Test
    public void should_initialized_when_execute_InitializeCommand() {
        MarsRover marsRover = new MarsRover();
        String result = marsRover.execute(new InitializeCommand());
        assertThat(result, is("location:(0, 0), direction: N"));
    }


}
