package day16_switch_ternary;

public class AdaireApartments {
    public static void main(String [] args){
        int numberOfbedrooms = 1;
        double startingPrice = 0;
        System.out.println("Welcome to Adaire Apartments");
        switch(numberOfbedrooms){
            case 0:
                System.out.println("");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("");
                startingPrice = 2899;
                break;
            default:
                System.out.println("5 bedroom currently is not available");
                


        }

        System.out.println("Starting price " + startingPrice + "$");
    }
}
