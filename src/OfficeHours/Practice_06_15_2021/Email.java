package OfficeHours.Practice_06_15_2021;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Email {
    final String ADDRESS;
    int numberOfEmails;
    static String domain;


    static{
        domain = "generic";
    }

    public Email(String address, int numberOfEmails){
        this.ADDRESS = address;
        this.numberOfEmails = numberOfEmails;
    }

    public static void sendEMAIL(){
        System.out.println("Sending from parent");
    }

    @Override
    public String toString() {
        return "Email{" +
                "Address='" + ADDRESS + '\'' +
                ", numberOfEmails=" + numberOfEmails +
                ", domain= " + domain +
                '}';
    }
}
