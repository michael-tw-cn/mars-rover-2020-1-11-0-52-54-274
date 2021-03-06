package com.thoughtworks.marsrover;

public class InitializeCommand extends Command {
    private Location location;
    private Direction direction;

    InitializeCommand(Location location, Direction direction) {
        this.location = location;
        this.direction = direction;
    }

    @Override
    public void run(MarsRover marsRover) {
        marsRover.change(this.location);
        marsRover.change(this.direction);
    }

    public Location location() {
        return this.location;
    }

    public Direction direction() {
        return this.direction;
    }
}
