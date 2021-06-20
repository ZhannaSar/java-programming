package OfficeHours.Practice_06_15_2021;

public class Gmail extends Email{

    static{
        domain = "Gmail";
    }

    public static void sendEMAIL(){
        System.out.println("Sending from Gmail");
    }

    public static void sendSuperEmail(){
    Email.sendEMAIL();
    }
    public Gmail(String address, int numberOfEmails) {
        super(address, numberOfEmails);

    }
}
