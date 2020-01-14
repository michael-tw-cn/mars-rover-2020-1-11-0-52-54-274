package com.thoughtworks.marsrover;

public class MoveCommand extends Command {
    @Override
    public void run(MarsRover marsRover) {
        marsRover.direction().move(marsRover);
    }
}
