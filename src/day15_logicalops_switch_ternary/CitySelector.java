package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";
        if (city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not considering - " + city);
        }

        String teacher = "Nadir";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("looks like it is java class with " + teacher);

        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);

        } else {
            System.out.println("Some class with " + teacher);
        }


        String company = "NadirTech";
        double salary = 85_000.0;
        if (company.equals("Google") || salary>=100_000) {
            System.out.println("accepting offer from " + company);
        } else {
            System.out.println("Rejecting offer from " + company);
        }
    }
}