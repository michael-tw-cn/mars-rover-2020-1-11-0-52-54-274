package com.thoughtworks.marsrover;

public class MarsRover {
    public String execute(InitializeCommand initializeCommand) {
        return initializeCommand.location() + ", " + initializeCommand.direction();
    }
}
