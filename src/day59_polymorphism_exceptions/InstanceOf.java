package day59_polymorphism_exceptions;

import day57_abstraction_polymorhism.shapes.Circle;
import day57_abstraction_polymorhism.shapes.Shape;
import day57_abstraction_polymorhism.shapes.Square;

public class InstanceOf {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square );


        System.out.println(shape.getClass().getSimpleName());
    }
}
