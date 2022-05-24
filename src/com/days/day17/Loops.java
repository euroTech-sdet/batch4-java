package com.days.day17;

public class Loops {
    public static void main(String[] args) {
        // will print "Hello world 3 times using for loop
        //  i =  3   third  cycle          "Hello World"

        //    no   1           no    2        no    3
        for (int i = 0;          i < 3;      i++) {

            // no   4

            System.out.println("Hello World");
            System.out.println("Bloody Java");


        }
        System.out.println("after loop ");

        //     first destination of compiler is  no 1   i=0
        //          second destination of compiler is no 2   if the condition is true
        //          third destination is              no 4 after block is executed
  //                forth step        is              no 3   i will be 1
        //          fifth step                        no 2     true ->
        //                                            no 4   will print hello world
        //                                            no 3   i++ ->  i will be 2
        //                                            no 2    condition is true
        //                                            no 4   print hello world
        //                                            mo 3   i++ ->  i will be 3
        //                                            no 2    i  is 3 condition is false will terminate the loop
         //                                                   will go line out of loop line  17

    }
}
