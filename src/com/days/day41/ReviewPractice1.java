package com.days.day41;

public class ReviewPractice1 {

    public static void main(String[] args) {
        String test = "Test";

        //    System.out.println(test.indexOf("a")); // return -1


        /* Create a method;

          - request an array
          - request a value of array
         -  then return index of the value with given text !!

            Sample: String []a = {"Honda","BMW","KIA","KIA"};
            arrayIndexFinder(a,"KIA") --> return -> "Your KIA value's index position is "2" !!"

            if there is more than 1 key in array, then return message: " Bro there is more than 1 Hop!!"
         */

        String[] a = {"KIA", null, "EEE", "KIA"};

        System.out.println("arrayIndexFinder(a,\"KIA\") = " + arrayIndexFinder(a, "KIA"));

    }


    public static int arrayIndexFinder(String[] array, String key) {

        if (array == null) {
            System.out.println("Provide array is NULL!!");
            return -1;
        }


        //       {"Honda","KIA","ABC","BMW"};
        int index = 0;
        while (index < array.length) {
          //  System.out.println("Outer LOOP");
          //  System.out.println("index outer = " + index);
            if (key.equalsIgnoreCase(array[index])) {
                int result= index;
                index++;
                while (index < array.length) {
                 //   System.out.println("Inner LOOP");
                 //   System.out.println("index inner = " + index);
                    if (key.equalsIgnoreCase(array[index])) {
                        System.out.println("BRO! You have more than 1 KEY!!");
                        return -1;
                    }
                    index++;
                }
                System.out.println("Your " + key + " value's index position is " + (result) + " !!");
                return (result);
            }
            index++;
        }


        System.out.println("The key " + key + " does not exist in given array!!!");
        return -1;
    }


}
