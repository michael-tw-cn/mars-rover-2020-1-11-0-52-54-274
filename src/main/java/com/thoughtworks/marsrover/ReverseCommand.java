package com.thoughtworks.marsrover;

public class ReverseCommand extends Command {
    @Override
    public void run(MarsRover marsRover) {
        marsRover.reverse();
    }
}
