package com.days.day70;

public class Generics<t> {


    t a;


    Generics() {

    }



    public t print(t any) {
        System.out.println(any);
        return any;
    }
}

class GenericTest {
    public static void main(String[] args) {
        Generics generics = new Generics();
        generics.print("bye bye java");
    }
}
