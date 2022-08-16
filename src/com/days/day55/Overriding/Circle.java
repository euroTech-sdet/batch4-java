package com.days.day55.Overriding;

public class Circle extends ShapePARENT {


    double diameter;


//    public Circle draw(){ // overriding method
//        return null;
//    }

//    public void draw(){ // overriding method
//        System.out.println("Child Circle Draw");
//    }


    @Override
    public void draw() {
        super.draw();
        System.out.println("Child Circle Draw");
        // implementation for circle class
    }

    public void calAreaCircle(){ // instance method for circle!!

    }


}
