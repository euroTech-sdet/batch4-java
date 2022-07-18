package com.days.day46;

public class Circle {


    public double radius ;

    // Constructor  - no return type!! . use same name with class name !!

//    public Circle(){
//
//    }

    public Circle(){  // default - no arg!!
        System.out.println("It is const method!!!");
        System.out.println("Your Object is ready now!");
        radius = 1;
    }



        public double getArea(){
        return Math.PI * radius * radius;
    }


    public double getPerimeter(){
        return 2* radius* Math.PI;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }

    public double getRadius(){
       return this.radius;
    }
}
