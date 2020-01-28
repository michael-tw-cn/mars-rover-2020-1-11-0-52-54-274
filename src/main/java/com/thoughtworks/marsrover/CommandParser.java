package com.thoughtworks.marsrover;

import java.lang.reflect.InvocationTargetException;

class CommandParser {
    Command parse(String command)
            throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        String[] splitWords = command.split(",");
        if (splitWords.length == 1) {
            return parseSingleChar(splitWords[0]);
        }
        Direction direction = Direction.from(splitWords[2]);
        Location location = new Location(Integer.parseInt(splitWords[0]), Integer.parseInt(splitWords[1]));
        return new InitializeCommand(location, direction);
    }

    private Command parseSingleChar(String command) {
        switch (command) {
            case "M":
                return new MoveCommand();
            case "L":
                return new TurnLeftCommand();
            case "R":
                return new TurnRightCommand();
            case "B":
                return new ReverseCommand();
        }
        throw new IllegalArgumentException(command);
    }
}
