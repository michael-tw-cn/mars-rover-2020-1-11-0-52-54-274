package com.thoughtworks.marsrover;

public class SDirection extends Direction {
    @Override
    public void turnLeft(MarsRover marsRover) {
        marsRover.change(new EDirection());
    }

    @Override
    public void turnRight(MarsRover marsRover) {
        marsRover.change(new WDirection());
    }

    @Override
    public void move(MarsRover marsRover) {
        marsRover.change(marsRover.location().decreaseX());
    }
}
