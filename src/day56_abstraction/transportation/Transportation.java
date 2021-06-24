package day56_abstraction.transportation;

public abstract class Transportation {
    public abstract void transportPeople();
    public abstract void cost(int mile);
    public void start(){
        System.out.println("Starting");
    }

    public void stop(){
        System.out.println("Shut off");
    }
}
