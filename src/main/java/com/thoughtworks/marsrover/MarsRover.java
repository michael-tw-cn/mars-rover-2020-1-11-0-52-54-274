package com.thoughtworks.marsrover;

public class MarsRover {
    public String execute(InitializeCommand initializeCommand) {
        return String.format("location:(%d, %d), direction: %s",
                initializeCommand.location().x(),
                initializeCommand.location().y(),
                initializeCommand.direction());
    }
}
