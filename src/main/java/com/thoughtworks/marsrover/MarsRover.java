package com.thoughtworks.marsrover;

public class MarsRover {
    private Location location;
    private Direction direction;

    @Override
    public String toString() {
        return this.location + ", " + this.direction;
    }

    public String execute(Command command) {
        command.run(this);
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

    public Direction direction() {
        return this.direction;
    }
}
