package com.days.day63;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape("shape");
        shape.draw();
        Circle circle = new Circle("smallCircle");
        circle.draw();

        Triangle triangle = new Triangle("triangle");
        triangle.draw();
        Shape circle1 = new Circle("Bigcircle");
        Shape triangle1 = new Triangle("triangle1");
        circle1.draw();


        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);// circle is a shape
        shapeList.add(triangle);
        shapeList.add(circle1);
        shapeList.add(circle1);
        shapeList.add(shape);

        Shape[] shapeArray = new Shape[3];
        shapeArray[0] = circle;
        shapeArray[1] = circle1;
        shapeArray[2] = triangle;


        for (int i = 0; i < shapeList.size(); i++) {
            System.out.println("shapeList.get(i).name = " + shapeList.get(i).name);
        }

        for (Shape s : shapeList) {
            System.out.println("s.name = " + s.name);
        }

        drawShape(circle);
        drawShape(triangle);
        drawShape(triangle1);

    }

    public static void drawShape(Shape shape) {
        System.out.println("we are again drawing a shape : " + shape.name);
    }


}
