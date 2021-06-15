package day12_conditional_statemets;

public class ComparisonExamples {
    public static void main(String[] args){
        int currentSpeed =45;
        int speedLimit = 55;
        int speeding = speedLimit - currentSpeed;
        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit < currentSpeed);
        System.out.println(speedLimit == currentSpeed);

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit + " mph");

        currentSpeed +=20;

        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit + " mph");

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("Can I afford? - " + (accountBalance >= itemPrice));//true

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can afford = " + canAfford); //true

        //decrease balance by itemprice. using shorthand operator
        accountBalance = accountBalance - itemPrice;
        System.out.println(accountBalance);
        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <= 0;
        System.out.println("Are you broke? - " + isBroke);

        

    }
}
