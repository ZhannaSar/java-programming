package day54_abstraction;

public class Pizza extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("Stretch the dough");
    }

    @Override
    public void serve() {
        System.out.println("Serving");
    }

    @Override
    public void charge() {
        System.out.println("Charging");
    }
}
