package day23_string_manipulation_while_loop;

import java.util.Scanner;
public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [Nadir] from number  <2223334444> Message: {Hello, lets code some java}";
        String sender, mobileNumber, text;
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start+1,end));
        sender = message.substring(message.indexOf("[")+1,message.indexOf("]"));
        System.out.println("sender = " + sender);
        mobileNumber = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println("mobileNumber = " + mobileNumber);
        text = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("text = " + text);

    }
}
