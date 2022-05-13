package com.days.day10;

public class Questions2 {
    public static void main(String[] args) {

//        Write a program to calculate the digits of a 5 digit.(76543)  12345
        //  first digit will be 3
        // second 4
        // third will be 5
        // you should create 5 variable data types will be integer
        // int first
        // at the end of your operation first will be 3 for (76543)
        // 76543
        int number = 54321;
        int digit1, digit2, digit3, digit4, digit5;
        digit5 = number / 10000;
        System.out.println("digit5 = " + digit5);
        // 76543     6543
        number %= 10000;//number = number % 10000;
        System.out.println("number = " + number);// 6543
        digit4 = number / 1000;// 6
        System.out.println("digit4 = " + digit4);
        number %= 1000;// number will be 543
        digit3 = number / 100;
        number %= 100;// number 43
        digit2 = number / 10;
        System.out.println("number = " + number);
        digit1 = number % 10;
        System.out.println("digit1 = " + digit1);
        System.out.println("digit2 = " + digit2);
        System.out.println("digit3 = " + digit3);
        System.out.println("digit4 = " + digit4);
        System.out.println("digit5 = " + digit5);

        int digit = 76543;

        int sum1= digit%10;
        int sum2= (digit/10)%10;
        int sum3= (digit/100)%10;
        int sum4= (digit/1000)%10;
        int sum5= (digit/10000)%10;
        System.out.println( sum1+sum2 +sum3 + sum4 + sum5);


//        Write a program to reverse a 3-digit number. number 987 output  : 789
        //    123        321



    }
}
