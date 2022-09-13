package com.days.day72;

public class Cake {
    static {
        System.out.println("static block is  executed");
        System.out.println("static block executed only one time ");
    }

    {
        System.out.println("whenever you create an object before constructor");
        System.out.println("instance block executed");
    }

    Cake() {
        System.out.println("object created");
    }

    int slices;
    static int familyCakeSlices = 20;

    public void eatCake() {

        slices--;//  eating from personal cake
        familyCakeSlices--;  // eaitng from family cake
    }

    public static void eatCakeFromFamilyCake() {
        familyCakeSlices--;
    }
}

class CakeTest {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.slices = 10;
        cake.eatCake();
        System.out.println("cake.slices = " + cake.slices); //9

        Cake cake2 = new Cake();
        System.out.println("cake2.slices = " + cake2.slices); // 0
        cake2.slices = 5;
        cake2.eatCake();// 4
        cake2.eatCake();// 3
        System.out.println("cake2.slices = " + cake2.slices);// 3
        System.out.println("Cake.familyCakeSlices = " + Cake.familyCakeSlices);  //  20-3=17
        Cake.eatCakeFromFamilyCake();// 16
        System.out.println("Cake.familyCakeSlices = " + Cake.familyCakeSlices);

        Cake cake3 = new Cake();
        cake3.eatCake();// 15
        System.out.println("Cake.familyCakeSlices = " + Cake.familyCakeSlices);
        Cake cake4 = new Cake();
        cake4.eatCake();
    }
}
