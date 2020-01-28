package com.thoughtworks.marsrover;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class CommandParserTest {

    @Test
    public void should_return_initialized_command_when_given_0_0_N() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        CommandParser commandParser = new CommandParser();
        Command command = commandParser.parse("0,0,N");

        assertTrue(command instanceof InitializeCommand);
        InitializeCommand initializeCommand = (InitializeCommand) command;
        assertThat(initializeCommand.location().toString(), is("location:(0, 0)"));
        assertThat(initializeCommand.direction().toString(), is("direction: N"));
    }

    @Test
    public void should_return_intialized_command_when_given_0_0_S() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        CommandParser commandParser = new CommandParser();
        Command command = commandParser.parse("0,0,S");

        assertTrue(command instanceof InitializeCommand);
        InitializeCommand initializeCommand = (InitializeCommand) command;
        assertThat(initializeCommand.location().toString(), is("location:(0, 0)"));
        assertThat(initializeCommand.direction().toString(), is("direction: S"));
    }

    @Test
    public void should_return_MoveCommand_when_given_M() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        CommandParser commandParser = new CommandParser();
        Command command = commandParser.parse("M");

        assertTrue(command instanceof MoveCommand);
    }

    @Test
    public void should_return_TurnLeftCommand_when_given_L() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        CommandParser commandParser = new CommandParser();
        Command command = commandParser.parse("L");

        assertTrue(command instanceof TurnLeftCommand);
    }

    @Test
    public void should_return_TurnRightCommand_when_given_R() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        CommandParser commandParser = new CommandParser();
        Command command = commandParser.parse("R");

        assertTrue(command instanceof TurnRightCommand);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_IllegalArgumentException_when_given_P() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        CommandParser commandParser = new CommandParser();
        commandParser.parse("P");
    }

    @Test
    public void should_return_ReverseCommand_when_given_B() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        CommandParser commandParser = new CommandParser();
        Command command = commandParser.parse("B");

        assertTrue(command instanceof ReverseCommand);
    }
}
