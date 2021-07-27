package OfficeHours.Practice_03_29_2021;

public class Sandwich {
    //bread
    //01234     length = 5
    public static void main(String[] args) {
        String str = "breadjambread";
        //jambread  lenght = 8
        //01234567


        if(str.contains("bread")){
            int firstBread = str.indexOf("bread");
            if(str.substring(firstBread+5).contains("bread")){//jambread
               // int secondBread = str.substring(firstBread+5).indexOf("bread");
                int secondBread = str.lastIndexOf("bread");
                //System.out.println(secondBraed1);
                System.out.println(str.substring((firstBread+5),secondBread));




            } else {
                System.out.println("nothing");
            }


        } else {
            System.out.println("nothing");
        }
    }
}
