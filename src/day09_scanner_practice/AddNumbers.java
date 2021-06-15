package day09_scanner_practice;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args){

        Scanner UserInput = new Scanner(System.in);

        byte b1= UserInput.nextByte();
        byte b2 = UserInput.nextByte();
        
        int max = (b1> b2) ? b1 + 2: b2 -4;
        System.out.println("max = " + max);
                
        



    }
}
