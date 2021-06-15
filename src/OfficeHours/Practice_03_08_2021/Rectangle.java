package OfficeHours.Practice_03_08_2021;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        //Hard coded values
//        double length = 5;
//        double width = 3;

        //dynamic with scanner
        Scanner input = new Scanner(System.in);
        System.out.println("What value is length");
        double length = input.nextDouble();
        System.out.println("What value is width");
        double width = input.nextDouble();
        double perimeter = 2 * (length + width);
        double area = length * width;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);


    }
}
