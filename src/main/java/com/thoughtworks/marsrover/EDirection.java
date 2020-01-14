package com.thoughtworks.marsrover;

public class EDirection extends Direction {

    @Override
    public void turnLeft(MarsRover marsRover) {
        marsRover.change(new NDirection());
    }
}
