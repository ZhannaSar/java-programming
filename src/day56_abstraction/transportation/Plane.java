package day56_abstraction.transportation;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void hi() {
        System.out.println("Welcome");
    }

    @Override
    public void bye() {

    }

    @Override
    public void transportPeople() {
        System.out.println("Flying People from one city to another");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane costs " + (mile * 0.10) + " to drive " + mile + " miles");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Flying on auto mode");
    }
}
