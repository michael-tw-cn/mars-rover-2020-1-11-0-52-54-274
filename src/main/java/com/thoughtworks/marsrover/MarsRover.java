package com.thoughtworks.marsrover;

public class MarsRover {
    private Location location;
    private Direction direction;

    @Override
    public String toString() {
        return this.location + ", " + this.direction;
    }

    public String execute(Command command) {
        if (command instanceof InitializeCommand) {
            this.location = ((InitializeCommand) command).location();
            this.direction = ((InitializeCommand) command).direction();
        } else if (command instanceof TurnLeftCommand) {
            this.direction.turnLeft(this);
        } else if (command instanceof TurnRightCommand) {
            this.direction.turnRight(this);
        } else if (command instanceof MoveCommand) {
            this.direction.move(this);
        }
        return this.toString();
    }

    public void change(Direction direction) {
        this.direction = direction;
    }

    public Location location() {
        return this.location;
    }

    public void change(Location location) {
        this.location = location;
    }
}
