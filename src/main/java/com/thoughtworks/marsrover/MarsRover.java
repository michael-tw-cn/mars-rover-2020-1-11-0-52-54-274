package com.thoughtworks.marsrover;

public class MarsRover {
    private Location location;
    private Direction direction;

    @Override
    public String toString() {
        return this.location + ", " + this.direction;
    }

    String execute(Command command) {
        command.run(this);
        return this.toString();
    }

    void change(Direction direction) {
        this.direction = direction;
    }

    Location location() {
        return this.location;
    }

    void change(Location location) {
        this.location = location;
    }

    public Direction direction() {
        return this.direction;
    }
}
