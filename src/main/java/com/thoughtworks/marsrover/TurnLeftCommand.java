package com.thoughtworks.marsrover;

public class TurnLeftCommand extends Command {

    @Override
    public void run(MarsRover marsRover) {
        marsRover.direction().turnLeft(marsRover);
    }
}
