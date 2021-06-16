package day54_abstraction;

public class Salad extends MenuItem{

    @Override
    public void prepare(){
        System.out.println("chobb, veggies and mayo");
    }

    public void serve(){
        System.out.println("Put into bowl and serve with forks");
    }

    @Override
    public void charge() {
        System.out.println("charge");
    }


}
