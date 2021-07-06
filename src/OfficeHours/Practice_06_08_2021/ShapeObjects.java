package OfficeHours.Practice_06_08_2021;

public class ShapeObjects {
    public static void main(String[] args) {
        Shape shape1 =new Shape();
        shape1.calculateArea();



        Square squareOne = new Square();
        squareOne.side =5;
        squareOne.calculateArea();
        System.out.println(squareOne);
    }
}
