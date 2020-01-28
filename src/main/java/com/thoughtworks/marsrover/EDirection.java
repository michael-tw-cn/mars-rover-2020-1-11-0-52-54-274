package com.thoughtworks.marsrover;

public class EDirection extends Direction {

    @Override
    public void turnLeft(MarsRover marsRover) {
        marsRover.change(new NDirection());
    }

    @Override
    public void turnRight(MarsRover marsRover) {
        marsRover.change(new SDirection());
    }

    @Override
    public void move(MarsRover marsRover) {
        Location location = marsRover.isReversed() ? marsRover.location().decreaseY() : marsRover.location().increaseY();
        marsRover.change(location);
    }
}
