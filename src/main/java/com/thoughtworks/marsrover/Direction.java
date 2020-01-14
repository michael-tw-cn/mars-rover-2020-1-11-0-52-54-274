package com.thoughtworks.marsrover;

class Direction {

    @Override
    public String toString() {
        return "direction: " + this.getClass().getSimpleName().substring(0,1);
    }
}
