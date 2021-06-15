package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        checkingAccount acc = new checkingAccount();
        acc.setAccountNumber(565365456463L);
        acc.setBalance(3543.67);
        acc.setAccountHolder("Zhanna Sarsenova");
        acc.setType("360 Checking");
        System.out.println(acc);

    }
}
