package com.thoughtworks.marsrover;

abstract class Direction {

    @Override
    public String toString() {
        return "direction: " + this.getClass().getSimpleName().substring(0, 1);
    }

    public abstract void turnLeft(MarsRover marsRover);

    public abstract void turnRight(MarsRover marsRover);

    public abstract void move(MarsRover marsRover);
}
