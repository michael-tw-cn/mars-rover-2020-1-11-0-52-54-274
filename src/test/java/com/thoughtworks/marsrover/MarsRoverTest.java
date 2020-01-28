package com.thoughtworks.marsrover;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {
    @Test
    public void should_initialized_when_execute_InitializeCommand() {
        MarsRover marsRover = newMarsRover();
        String result = marsRover.execute(new InitializeCommand(new Location(0, 0), new NDirection()));
        assertThat(result, is(expected(0, 0, "N")));
    }

    private String expected(int x, int y, String direction) {
        return String.format("location:(%d, %d), direction: %s", x, y, direction);
    }

    @Test
    public void should_initialized_when_execute_InitializeCommand_0_1_N() {
        MarsRover marsRover = newMarsRover();
        String result = marsRover.execute(new InitializeCommand(new Location(0, 1), new NDirection()));
        assertThat(result, is(expected(0, 1, "N")));
    }

    @Test
    public void should_be_W_when_turn_left_and_given_N() {
        MarsRover marsRover = newMarsRover();
        marsRover.execute(new InitializeCommand(new Location(0,0), new NDirection()));

        String result = marsRover.execute(new TurnLeftCommand());

        assertThat(result, is(expected(0, 0, "W")));
    }

    @Test
    public void should_be_E_when_turn_right_and_given_N() {
        MarsRover marsRover = newMarsRover();
        marsRover.execute(new InitializeCommand(new Location(0,0), new NDirection()));

        String result = marsRover.execute(new TurnRightCommand());

        assertThat(result, is(expected(0, 0, "E")));
    }

    @Test
    public void should_be_N_when_turn_left_and_given_E() {
        MarsRover marsRover = newMarsRover();
        marsRover.execute(new InitializeCommand(new Location(0,0), new EDirection()));

        String result = marsRover.execute(new TurnLeftCommand());

        assertThat(result, is(expected(0, 0, "N")));
    }

    @Test
    public void should_be_S_when_turn_right_and_given_E() {
        MarsRover marsRover = newMarsRover();
        marsRover.execute(new InitializeCommand(new Location(0,0), new EDirection()));

        String result = marsRover.execute(new TurnRightCommand());

        assertThat(result, is(expected(0, 0, "S")));
    }

    @Test
    public void should_be_E_when_turn_left_and_given_S() {
        MarsRover marsRover = newMarsRover();
        marsRover.execute(new InitializeCommand(new Location(0,0), new SDirection()));

        String result = marsRover.execute(new TurnLeftCommand());

        assertThat(result, is(expected(0, 0, "E")));
    }

    @Test
    public void should_be_W_when_turn_right_and_given_S() {
        MarsRover marsRover = newMarsRover();
        marsRover.execute(new InitializeCommand(new Location(0,0), new SDirection()));

        String result = marsRover.execute(new TurnRightCommand());

        assertThat(result, is(expected(0, 0, "W")));
    }


    @Test
    public void should_be_S_when_turn_left_and_given_W() {
        MarsRover marsRover = newMarsRover();
        marsRover.execute(new InitializeCommand(new Location(0,0), new WDirection()));

        String result = marsRover.execute(new TurnLeftCommand());

        assertThat(result, is(expected(0, 0, "S")));
    }

    @Test
    public void should_be_N_when_turn_right_and_given_W() {
        MarsRover marsRover = newMarsRover();
        marsRover.execute(new InitializeCommand(new Location(0,0), new WDirection()));

        String result = marsRover.execute(new TurnRightCommand());

        assertThat(result, is(expected(0, 0, "N")));
    }

    @Test
    public void should_increase_x_when_move_and_given_current_direction_is_N() {
        MarsRover marsRover = newMarsRover();
        marsRover.execute(new InitializeCommand(new Location(0,0), new NDirection()));

        String result = marsRover.execute(new MoveCommand());

        assertThat(result, is(expected(1, 0, "N")));
    }

    @Test
    public void should_decrease_x_when_move_and_given_current_direction_is_S() {
        MarsRover marsRover = newMarsRover();
        marsRover.execute(new InitializeCommand(new Location(0,0), new SDirection()));

        String result = marsRover.execute(new MoveCommand());

        assertThat(result, is(expected(-1, 0, "S")));
    }

    @Test
    public void should_decrease_y_when_move_and_given_current_direction_is_W() {
        MarsRover marsRover = newMarsRover();
        marsRover.execute(new InitializeCommand(new Location(0,0), new WDirection()));

        String result = marsRover.execute(new MoveCommand());

        assertThat(result, is(expected(0, -1, "W")));
    }

    @Test
    public void should_increase_y_when_move_and_given_current_direction_is_E() {
        MarsRover marsRover = newMarsRover();
        marsRover.execute(new InitializeCommand(new Location(0,0), new EDirection()));

        String result = marsRover.execute(new MoveCommand());

        assertThat(result, is(expected(0, 1, "E")));
    }

    private MarsRover newMarsRover() {
        return new MarsRover(new CommandParser());
    }

    @Test
    public void should_parse_from_CommandParser_when_given_commands()
            throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        List<String> commands = List.of("0,0,N", "M");
        String result = newMarsRover().execute(commands);

        assertThat(result, is(expected(1, 0, "N")));

    }

    @Test
    public void should_decrease_x_when_move_and_given_current_direction_is_N_and_reversion_status_is_true() {
        MarsRover marsRover = newMarsRover();
        marsRover.execute(new InitializeCommand(new Location(0, 0), new NDirection()));
        marsRover.execute(new ReverseCommand());

        String result = marsRover.execute(new MoveCommand());

        assertThat(result, is(expected(-1, 0, "N")));
    }

    @Test
    public void should_increase_x_when_move_and_given_current_direction_is_S_and_reversion_status_is_true() {
        MarsRover marsRover = newMarsRover();
        marsRover.execute(new InitializeCommand(new Location(0, 0), new SDirection()));
        marsRover.execute(new ReverseCommand());

        String result = marsRover.execute(new MoveCommand());

        assertThat(result, is(expected(1, 0, "S")));
    }

    @Test
    public void should_increase_y_when_move_and_given_current_direction_is_W_and_reversion_status_is_true() {
        MarsRover marsRover = newMarsRover();
        marsRover.execute(new InitializeCommand(new Location(0, 0), new WDirection()));
        marsRover.execute(new ReverseCommand());

        String result = marsRover.execute(new MoveCommand());

        assertThat(result, is(expected(0, 1, "W")));
    }

    @Test
    public void should_decrease_y_when_move_and_given_current_direction_is_E_and_reversion_status_is_true() {
        MarsRover marsRover = newMarsRover();
        marsRover.execute(new InitializeCommand(new Location(0, 0), new EDirection()));
        marsRover.execute(new ReverseCommand());

        String result = marsRover.execute(new MoveCommand());

        assertThat(result, is(expected(0, -1, "E")));
    }

}
