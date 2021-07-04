package day58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {
        Father spMan1 = new SuperMan();
        spMan1.raiseKid();
        spMan1.feedKid();
        spMan1.playWithKid();
        Worker spMan2 = new SuperMan();
        spMan2.getPaid();
        spMan2.work("sdet");

        SuperMan spMan3 = new SuperMan();
        spMan3.getPaid();
        spMan3.feedKid();
        spMan3.work("manager");
        spMan3.raiseKid();
        spMan3.playWithKid();

    }
}
