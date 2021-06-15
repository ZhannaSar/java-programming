package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount husband = new BankAccount();
        husband.user ="baur";
        husband.showBalance();
        husband.spend(100);

        BankAccount wife = new BankAccount();
        wife.user ="zhanna";
        wife.showBalance();
        wife.spend(200);
    }
}
