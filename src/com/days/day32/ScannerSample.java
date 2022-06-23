package com.days.day32;


import java.util.Scanner;

public class ScannerSample {




    public static void main(String[] args) {
        int number1=1; // local variable
        // System.out.println("Print to console!!");

 //       Scanner scanner = new Scanner(System.in);

//        System.out.println("Welcome USER!! \nPlease Enter Your Lucky Number:  ");

//     int number = scanner.nextInt();

//     double num2 = scanner.nextDouble();

 //       byte num2 = scanner.nextByte();
//        scanner.close();

 //       System.out.println("Thank you!");

  //      System.out.println("Your lucky number is " + num2);


 //     System.out.println("Calculation of area: " + calculateCircleArea());

//        System.out.println("Calculate average: "+ calculateAverage());
  //      System.out.println("Calculate average: "+ average());


        System.out.println(CelsiusToFahrenheit());

    }

    // Create a method, request radius from user!! then return area of circle!

    public static double calculateCircleArea(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radius: ");

        double radius = scanner.nextDouble(); //1
        scanner.close();

        return 3.14 * radius * radius;
    }


    // Create a method, this method will request 3 number from user, and will return average of numbers

    public static double calculateAverage(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter number-1");
        double num1=scanner.nextDouble();
        System.out.println("Please enter number-2");
        double num2=scanner.nextDouble();
        System.out.println("Please enter number-3");
        double num3=scanner.nextDouble();

        scanner.close();

        return (num1+num2+num3)/3;
    }


    public static double average(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please your numbers: ");

        double num1 = scanner.nextDouble(); //10
        System.out.println(" num2: ");
        double num2 = scanner.nextDouble(); //20
        System.out.println(" num3: ");
        double num3 = scanner.nextDouble(); //30

        return  (num1 + num2 + num3)/ 3;
    }



    public static double CelsiusToFahrenheit(){

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Celsius value");
        double Celsius = scanner.nextDouble();
        return ((9.0/5)*Celsius)+32;

    }

}
