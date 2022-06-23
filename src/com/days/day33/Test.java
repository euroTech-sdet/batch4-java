package com.days.day33;

public class Test {

    public static void main(String[] args) {
        ReviewWeek9 obje1 = new ReviewWeek9();
        obje1.test1= 1;
        obje1.test2=11;
        ReviewWeek9 obje2 = new ReviewWeek9();
        obje2.test1= 2;
        obje2.test2=22;

        ReviewWeek9.test2=333;

        System.out.println("obje1.test1 = " + obje1.test1);
        System.out.println("obje2.test1 = " + obje2.test1);
        System.out.println("ReviewWeek9.test2 = " + ReviewWeek9.test2);

        System.out.println("obje1.test2 = " + obje1.test2);

        //  ReviewWeek9.test1; !!can not call inst variable with class name!!



        ReviewWeek9 obje3;

        // System.out.println(obje3.test1); give error!!


        ReviewWeek9 obje4= new ReviewWeek9();

        System.out.println("obje4.test1 = " + obje4.test1);

        System.out.println("obje4.testDob = " + obje4.testDob);

        System.out.println("obje4.testStr = " + obje4.testStr);


    }

}
