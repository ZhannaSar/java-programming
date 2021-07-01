package OfficeHours.Practice_06_22_2021;

public class Amazon extends OnlineShopping implements AllowUsersToSell{


    @Override
    public void ViewCart() {
        System.out.println("Viewing Amazon card");
    }

    @Override
    public boolean payForShipping(double price) {
       return price>50;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item from Amazon");
    }

    @Override
    public void uploadProduct() {
        System.out.println("Amazon Seller");
    }
}
