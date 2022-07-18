package com.days.day46;

public class TestPhone {



    public static void main(String[] args) {


        Phone phone1= new Phone();
        System.out.println("phone1.modelName = " + phone1.modelName);
        phone1.serialNumber=10001;

        phone1.modelName= "Nokia";

        System.out.println("phone1.modelName = " + phone1.modelName);

        phone1.updateModelName("Sony");

        System.out.println("phone1.modelName = " + phone1.modelName);


        System.out.println("\n/////////////////////////////////////\n");


        System.out.println("phone1.serialNumber = " + phone1.serialNumber);

        Phone phone2= new Phone();
        phone2.serialNumber=100002;
        System.out.println("phone2.serialNumber = " + phone2.serialNumber);

        Phone phone3= new Phone();

        Phone phone4= new Phone();

        Phone phone5= new Phone();

        Phone phone6= new Phone();


        System.out.println("Total Phone object number is :" + Phone.totalObj ); // 6
        System.out.println("Total Phone object number is :" + phone1.totalObj ); // ? 6
        System.out.println("Total Phone object number is :" + phone2.totalObj ); // ? 6


        System.out.println("\n/////////////////////////////////////\n");



        Phone sony123= new Phone();
        sony123.serialNumber= 10004;
        sony123.modelName = "SkyBlue";
        sony123.objSpecific= 12;


        Phone sonyBlueSky = new Phone(10005,"dada",222);
        System.out.println(sonyBlueSky.serialNumber);


        System.out.println("\n/////////////////////////////////////\n");


        Phone mi6 = new Phone(10006);
        System.out.println("mi6.serialNumber = " + mi6.serialNumber);

    }
}
