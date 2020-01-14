package com.thoughtworks.marsrover;

class HelloWorld {
    private Dependency dependency;

    HelloWorld(Dependency dependency) {

        this.dependency = dependency;
    }

    String beenCalled() {
        return dependency.say();
    }
}
