package com.days.day72;

public abstract class Fruit {

    String name;
    int calory;
    boolean sweet;

    public void growing() {
        System.out.println("apples are growing on the tree.");
    }

    public abstract void spoiling();

//    private Fruit() {
//
//    }

    public static void main(String[] args) {
        // Fruit fruit1 = new Fruit();
    }
}

class Test {
    public static void main(String[] args) {
        // Fruit fruit1 = new Fruit();//while we are creating object we are calling/invoking constructor

    }

}