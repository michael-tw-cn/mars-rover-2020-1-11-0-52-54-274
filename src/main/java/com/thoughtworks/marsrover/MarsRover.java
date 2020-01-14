package com.thoughtworks.marsrover;

public class MarsRover {
    private Location location;
    private Direction direction;

    public String execute(InitializeCommand initializeCommand) {
        this.location = initializeCommand.location();
        this.direction = initializeCommand.direction();
        return this.toString();
    }

    @Override
    public String toString() {
        return this.location + ", " + this.direction;
    }

    public String execute(Command command) {
        if (command instanceof TurnLeftCommand) {
            this.direction = new WDirection();
        } else if (command instanceof TurnRightCommand) {
            this.direction = new EDirection();
        }
        return this.toString();
    }
}
