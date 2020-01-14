package com.thoughtworks.marsrover;

public class TurnRightCommand extends Command {
    @Override
    public void run(MarsRover marsRover) {
        marsRover.direction().turnRight(marsRover);
    }
}
