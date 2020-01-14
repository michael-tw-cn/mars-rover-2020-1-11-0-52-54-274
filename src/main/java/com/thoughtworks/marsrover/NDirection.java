package com.thoughtworks.marsrover;

public class NDirection extends Direction {
    @Override
    public void turnLeft(MarsRover marsRover) {
        marsRover.change(new WDirection());
    }
}
