package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args){
        int last4SSn = 1234;
        int pinCode = 4567;
        int expLast4SSN = 1234;
        int expPincode =7797;
        if(last4SSn == expLast4SSN && pinCode == expPincode){
            System.out.println("Authentication successful");

        } else {
            System.out.println("Authentication unsuccessful");
            if (last4SSn != expLast4SSN)
                System.out.println("Last 4 of SSN did not match");
            if (pinCode !=expPincode)
                System.out.println("pinCode did not match");
            }
        }
    }

