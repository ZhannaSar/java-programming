package day57_abstraction_polymorhism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();
        Shape circle = new Circle();
        circle.draw();
        Shape square =new Square();
        square.draw();

        List <Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Square());
        shapes.add(new Circle());

        for(Shape eachShape: shapes){
            eachShape.draw();
        }
    }
    public static void drawShape(Shape shape) {
        System.out.println("----Drawing shape----");
        shape.draw();
    }
}
