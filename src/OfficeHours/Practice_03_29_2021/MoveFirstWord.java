package OfficeHours.Practice_03_29_2021;

public class MoveFirstWord {
    public static void main(String[] args) {
        String sent = "Java is a fun language";
        int firstSpace = sent.indexOf(" ");
        String firstWord = sent.substring(0, firstSpace);
        System.out.println(sent.substring(firstSpace+1)+ " " + firstWord);
    }
}
