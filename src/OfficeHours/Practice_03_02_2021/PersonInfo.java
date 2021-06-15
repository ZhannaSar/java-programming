package OfficeHours.Practice_03_02_2021;

//  src -> new package called OfficeHours -> new package called
//  Practice_03_02_2021

/*Make a class PersonInfo
make a main method

Create variables and give value related to you:

    - String name
    - byte age
    - char gender
    - boolean student
    - short number of siblings
    - long favorite number
    - int number of seasons in your area
    - double birth date: (month.day)
    - int year
    - String full birthday date with year
    - String favorite quote

    - Print the person information

    - Challenge: print your name in a cool way (unicode)
    - Challenge: char star
 */

public class PersonInfo {
    public static void main(String[] args){

        //Variables

        String name, fullBirthDate, favouriteQuote;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favouriteNumber;
        int numberOfSeasons, year;
        double birthDate;

        //Assignment of data

        name = "Saim";
        age = 50;
        gender = 'M';
        student = true;
        numberOfSiblings = 5;
        favouriteNumber = 3L;
        numberOfSeasons = 4;
        birthDate = 3.2;
        year = 2021;
        fullBirthDate = "" +birthDate + "." + year;
        //  fullBirthDate = birthDate + year + ""; //2024.2
        favouriteQuote = "have a good mindset";
        String printName= "Name: " +name;
        System.out.println(printName);
        System.out.println("Age: " + age);
        System.out.println("Full birthdate: " + fullBirthDate);









}
}
