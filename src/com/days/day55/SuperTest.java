package com.days.day55;

public class SuperTest {

    int test;

    public static void main(String[] args) {

        Child child1 = new Child("Tester");

     //   System.out.println(child1.idNumber);

     //   child1.testDriver();

//        child1.idCheck();
//
//        child1.testBothDriver();
//
//        child1.testDriver();
//
//        System.out.println(child1.name);


        //  Parent parent1= new Parent("Tester");


        System.out.println("\n///////////CHILD 2/////////////\n");


        Child child2 = new Child();


        System.out.println("\n////////////CHILD 3////////////\n");

        Child child3 = new Child(111, "Developer");



    }




    public void testMethod (int test){
        System.out.println(test);

    }
}

