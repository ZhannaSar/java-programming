package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};
        
        System.out.println("--------Prices less than 100----------");
        for (double eachPrice  : prices) {
            if(eachPrice > 100) {
                System.out.println(eachPrice);
            }
        }
        System.out.println("----prices beetwen 10 and 70 inclusive");

        for (double eachPrice : prices) {
            if (eachPrice >= 10 && eachPrice <=70) {
                System.out.println(eachPrice);
            }
        }
        System.out.println("-----count of the prices that are more than 50-----");
        int count = 0;
        for (double eachPrices : prices) {
            if (eachPrices > 50) {
                count++;
            }
        }
        System.out.println("count = " + count);


        System.out.println("\n------countries with name length more than 7 - inclusive ------");
        for (String eachcountry: countries){
            if(eachcountry.length() >=7) {
                System.out.println(eachcountry);
            }
        }

    }
}
