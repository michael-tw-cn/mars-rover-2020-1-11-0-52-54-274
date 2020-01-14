package com.thoughtworks.marsrover;

public class WDirection extends Direction {
    @Override
    public void turnLeft(MarsRover marsRover) {
        marsRover.change(new SDirection());
    }

    @Override
    public void turnRight(MarsRover marsRover) {
        marsRover.change(new NDirection());
    }
}
