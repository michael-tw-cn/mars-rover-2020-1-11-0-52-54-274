package com.thoughtworks.marsrover;

class Direction {

    @Override
    public String toString() {
        return "direction: " + this.getClass().getSimpleName().substring(0, 1);
    }

    public void turnLeft(MarsRover marsRover) {
        marsRover.change(new WDirection());
    }

    public void turnRight(MarsRover marsRover) {
        marsRover.change(new EDirection());

    }
}
