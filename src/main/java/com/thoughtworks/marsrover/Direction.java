package com.thoughtworks.marsrover;

import java.lang.reflect.InvocationTargetException;

abstract class Direction {

    public static Direction from(String command)
            throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> clazz = Class.forName(Direction.class.getPackageName() + "." + command + Direction.class.getSimpleName());
        return (Direction) clazz.getConstructor().newInstance();
    }

    @Override
    public String toString() {
        return "direction: " + this.getClass().getSimpleName().substring(0, 1);
    }

    public abstract void turnLeft(MarsRover marsRover);

    public abstract void turnRight(MarsRover marsRover);

    public abstract void move(MarsRover marsRover);
}
