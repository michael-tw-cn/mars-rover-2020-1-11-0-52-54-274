package com.thoughtworks.marsrover;

public class InitializeCommand {
    private Location location;
    private Direction direction;

    public InitializeCommand(Location location, Direction direction) {
        this.location = location;
        this.direction = direction;
    }

    public Location location() {
        return this.location;
    }

    public Direction direction() {
        return this.direction;
    }
}
