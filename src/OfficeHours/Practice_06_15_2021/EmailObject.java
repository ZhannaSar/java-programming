package OfficeHours.Practice_06_15_2021;

public class EmailObject {
    public static void main(String[] args) {
        Email email = new Email("anton@cybertek.com",43);
        System.out.println(email);
        System.out.println(Gmail.domain);
        System.out.println(Email.domain);
        System.out.println();

        Gmail gmail = new Gmail("Kamran@gmail.com", 133);
        System.out.println(gmail);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println();


        Yahoo yahoo = new Yahoo("Zhanna@yahoo.com",134);
        System.out.println(yahoo);
        System.out.println(Yahoo.domain);
        System.out.println(Gmail.domain);
        System.out.println();


        Yahoo.domain = "generic";
        System.out.println(Yahoo.domain);
        System.out.println(Gmail.domain);


        Gmail.sendEMAIL();
        Gmail.sendSuperEmail();

    }
}
