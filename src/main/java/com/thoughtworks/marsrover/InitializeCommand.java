package com.thoughtworks.marsrover;

public class InitializeCommand {
    private Location location;
    private NDirection direction;

    public InitializeCommand(Location location, NDirection direction) {
        this.location = location;
        this.direction = direction;
    }

    public Location location() {
        return this.location;
    }

    public NDirection direction() {
        return this.direction;
    }
}
