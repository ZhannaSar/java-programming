package day56_abstraction.transportation;

import day56_abstraction.greeting.Greeting;

public class Tesla extends Transportation implements  SelfDrivable, Greeting {
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla costs " + (mile * 0.10) + " to drive " + mile + " miles");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Tesla is driving auto");
    }

    @Override
    public void hi() {
        System.out.println("Tesla is saying Beeep");
    }

    @Override
    public void bye() {
        System.out.println("Tesla is saying mauu");
    }
}
