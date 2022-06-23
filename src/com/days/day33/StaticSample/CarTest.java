package com.days.day33.StaticSample;

public class CarTest {


    public static void main(String[] args) {

        Honda civic1 = new Honda();
//        Honda.carNumber++;
        civic1.carNumber++;


        civic1.serialNumber= 1001;
        civic1.color= "white";

        Honda civic2 = new Honda();
        Honda.carNumber++;
        civic2.serialNumber=1002;
        civic2.color= "red";


        Honda jazz1 = new Honda();
        Honda.carNumber++;
        jazz1.serialNumber=1003;
        jazz1.color= "grey";


        System.out.println("jazz1 = " + jazz1);
        System.out.println("civic1 = " + civic1);


    }
}
