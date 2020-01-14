package com.thoughtworks.marsrover;

public class Location {
    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x() {
        return this.x;
    }

    public int y() {
        return this.y;
    }

    @Override
    public String toString() {
        return String.format("location:(%d, %d)", this.x, this.y);
    }
}
