package day51_inheritance;

public class Lux extends Lyft{
    @Override
    public double calculateRate(double miles){
        return super.calculateRate(miles) * 1.2;


    }
}
