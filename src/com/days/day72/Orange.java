package com.days.day72;

public class Orange extends Fruit {

    Orange() {
        this.name = "orange";
    }

    @Override
    public void spoiling() {
        System.out.println("you should keep " + name + " in the refrigeratgor. otherwise");
    }
}

class OrangeTest {
    public static void main(String[] args) {
        Orange orange = new Orange();
        orange.spoiling();
    }
}
