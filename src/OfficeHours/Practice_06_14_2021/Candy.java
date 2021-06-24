package OfficeHours.Practice_06_14_2021;

public class Candy {
    private String brand;
    private int quantity;
    private boolean hasPeanuts;
    private static int totalNumOfCandies;

    public Candy(String brand, int quantity, boolean hasPeanuts){
        this.brand = brand;
        this.quantity = quantity;
        this.hasPeanuts = hasPeanuts;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    public boolean isContainsPeanuts() {

        return hasPeanuts;
    }

    public void setContainsPeanuts(boolean containsPeanuts) {
        this.hasPeanuts = containsPeanuts;
    }

    public static int getTotalNumOfCandies() {

        return totalNumOfCandies;
    }

    public static void setTotalNumOfCandies(int totalNumOfCandies) {

        Candy.totalNumOfCandies = totalNumOfCandies;
    }


    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", containsPeanuts=" + hasPeanuts +
                '}';
    }
}
