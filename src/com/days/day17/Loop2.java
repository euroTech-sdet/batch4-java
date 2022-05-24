package com.days.day17;

public class Loop2 {
    public static void main(String[] args) {

        for (int i = 10; i <= 20; i++) {

            System.out.println(i);// 10 11  12  13 14 15  16  17 18 19 20?


        }

//        int i = 20;
//        if (i <= 20) {
//            System.out.println(i);
//        } else {
//            System.out.println("out of loop");
//        }
// i = i + 2   ->    i+=2
        for (int i = 0; i <= 10; i += 2) {

            System.out.println(i);// 0  2  4  6  8   10     value of i will increase 2 after each loop

        }

        for (int j=0;j<100;){

            System.out.println("j = " + j);//  0

        }




    }
}
