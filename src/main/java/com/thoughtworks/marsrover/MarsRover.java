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
            this.direction.turnLeft(this);
        } else if (command instanceof TurnRightCommand) {
            this.direction.turnRight(this);
        } else if (command instanceof MoveCommand) {
            if (this.direction instanceof NDirection) {
                this.location = this.location.increaseX();
            } else if (direction instanceof SDirection) {
                this.location = this.location.decreaseX();
            }
        }
        return this.toString();
    }

    public void change(Direction direction) {
        this.direction = direction;
    }
}
