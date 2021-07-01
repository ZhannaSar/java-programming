package OfficeHours.Practice_06_22_2021;

public class Ebay extends OnlineShopping implements AllowUsersToSell{

    @Override
    public void ViewCart() {
        System.out.println("Viewing cart on Ebay");
    }

    @Override
    public boolean payForShipping(double price) {
        return price < 100;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Ebay");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item from Ebay");
    }

    @Override
    public void uploadProduct() {
        System.out.println("Ebay seller");
    }
}
