package OfficeHours.Practice_06_22_2021;

public class Target extends Shopping{
    @Override
    public void buyItem(){
        System.out.println("Buying Item from Target");
    }

    public void returnItem(){
        System.out.println("Returning Item");
    }
}
