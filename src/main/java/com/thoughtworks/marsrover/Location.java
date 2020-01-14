package com.thoughtworks.marsrover;

public class Location {
    private int x;
    private int y;

    Location(int x, int y) {
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

    Location increaseX() {
        return new Location(this.x + 1, this.y);
    }

    Location decreaseX() {
        return new Location(this.x - 1, this.y);
    }

    Location decreaseY() {
        return new Location(this.x, this.y - 1);
    }

    Location increaseY() {
        return new Location(this.x, this.y + 1);
    }
}
