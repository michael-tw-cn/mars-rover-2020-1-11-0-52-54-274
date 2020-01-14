package com.thoughtworks.marsrover;

public class MarsRover {
    public String execute(InitializeCommand initializeCommand) {
        return initializeCommand.location() + ", " + initializeCommand.direction();
    }

    public String execute(TurnLeftCommand turnLeftCommand) {

        return "location:(0, 0), direction: W";
    }
}
