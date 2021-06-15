package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Honolulu";
        double salary = 150_000.0;
        boolean remote = true;
        boolean benefits = true;
        if (location.equals("Honolulu") && salary >= 110000.0 && remote && benefits) {
            System.out.println("Sure, I will accept this offer");
        } else {
            System.out.println("Lets consider offer to negotiate");
        }

    }
}
