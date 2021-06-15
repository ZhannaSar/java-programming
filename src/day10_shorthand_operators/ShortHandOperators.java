package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args){
        String word = "Java";
        System.out.println("word = " + word);

        word = word + "programming";
        System.out.println("word =" + word);
        //add " is fun"
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but \"selenium\" is more fun.";
        word += selenium;
        System.out.println("word = " + word);

        word += 12345;
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        //add 'J' to letter
        letter += 'U';
        System.out.println("letter = " + letter );
        double parkingFee = 7.50;
        System.out.println("normal parking fee = " + parkingFee);
        //early bird fee is 50 off
        //parkingFee = parkingFee / 2;
        parkingFee/=2;
        System.out.println("early bird parking fee = " + parkingFee);
        parkingFee -= parkingFee;
        System.out.println("weekend parking = " + parkingFee);



    }
}
