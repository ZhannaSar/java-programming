package OfficeHours.Practice_03_29_2021;

public class Sandwich2 {
    public static void main(String[] args) {
        String word = "breadjambread"; //bread length = 5
        if(word.contains("bread")){
            int firstWord = word.indexOf("bread"); //0
            //System.out.println(word.substring(firstWord+5,secondWord));
            if(word.substring(firstWord+5).contains("bread")){
                int secondWord = word.lastIndexOf("bread");//9
                System.out.println(word.substring(firstWord+5,secondWord));
            } else {
                System.out.println("nothing");
            }

        } else {
            System.out.println("nothing");
        }
    }
}
