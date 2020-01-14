package com.thoughtworks.marsrover;

abstract class Direction {

    @Override
    public String toString() {
        return "direction: " + this.getClass().getSimpleName().substring(0, 1);
    }

    public abstract void turnLeft(MarsRover marsRover);

    public void turnRight(MarsRover marsRover) {
        marsRover.change(new EDirection());

    }
}
