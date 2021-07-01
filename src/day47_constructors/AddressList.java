package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address();
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22098");

        System.out.println("CybertekSchool address: " + cybertekAddress.toString());
        cybertekAddress.setStreet(("Samal 1,dom 35,kv 2"));

        System.out.println("Address after update: " + cybertekAddress);
        System.out.println("Street info: " + cybertekAddress.getStreet());

        Address newAddress = new Address();
        newAddress.setStreet("Jones branch apartment567");
        newAddress.setCity("Mclean");
        newAddress.setState("VA");
        newAddress.setZipCode("778686");
        System.out.println(newAddress.toString());

        Address ad = new Address("Samal", "Almaty", "KZ","987899");
        System.out.println("papa john" + ad.toString());
    }
}