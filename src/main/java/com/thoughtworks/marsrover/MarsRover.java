package com.thoughtworks.marsrover;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class MarsRover {
    private Location location;
    private Direction direction;
    private CommandParser commandParser;
    private boolean reversed;

    public MarsRover(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    @Override
    public String toString() {
        return this.location + ", " + this.direction;
    }

    String execute(Command command) {
        command.run(this);
        return this.toString();
    }

    void change(Direction direction) {
        this.direction = direction;
    }

    Location location() {
        return this.location;
    }

    void change(Location location) {
        this.location = location;
    }

    public Direction direction() {
        return this.direction;
    }

    String execute(List<String> commands)
            throws ClassNotFoundException, NoSuchMethodException,
            InstantiationException, IllegalAccessException, InvocationTargetException {
        for (String command : commands) {
            this.execute(this.commandParser.parse(command));
        }
        return this.toString();
    }

    void reverse() {
        this.reversed = true;
    }

    public boolean isReversed() {
        return this.reversed;
    }
}
