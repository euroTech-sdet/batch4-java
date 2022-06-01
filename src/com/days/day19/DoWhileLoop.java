package com.days.day19;

public class DoWhileLoop {

    public static void main(String[] args) {


        do {
            System.out.println("Insede loop!!");
        } while (2 > 3);


        // Put go println inside the LOOP!! fix the code:
        int num1 = 3;

        do {
            System.out.println(num1);
            num1--;
            if(num1==0) {
                System.out.println(" GO!!!!!!!!!!!!!!! ");
            }
        } while (num1 > 0);
        //3
        //2
        //1
        // GO!!!!!!!!!!!#


        int number1=2;
        int number2=1;

        System.out.println("METHOD");

        while (number2>number1){
            System.out.println("METHOD");
        }


        do{
            System.out.println("METHOD");
        } while (number2>number1);
    }

}
