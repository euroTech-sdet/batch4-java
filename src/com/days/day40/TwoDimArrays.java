package com.days.day40;

import java.util.Arrays;

public class TwoDimArrays {


    public static void main(String[] args) {



        int [][] numbers= new int[3][3];

       //   0 -  1 - 2
//     0-   0 , 20 , 0
//     1-   0 , 0  , 0
//     2-   0 , 0  , 0

        numbers[0][1]=20;
        System.out.println(Arrays.deepToString(numbers));   // to print Multi Arrays!!!
        ///////////////////////////////////////////////////

        //   0 -  1 -   2
//     0-   10 , 20 ,  30
//     1-   11 , 22  , 33
//     2-   44 , 55  , 66

        int [][] testMatrix = {
                {10 , 20 ,  30},
                {11 , 22  , 33},
                {44 , 55  , 66}
        };

        // I want to change value of 55 to 155
        testMatrix[2][1] = 155;

        System.out.println( testMatrix[2][2]);


        System.out.println("\n////////////////////////////// \n");


        int [] oneD= {1,2,3};

        System.out.println("oneD.length = " + oneD.length);

        int [][] twoD = {         // 2 x 3
                {10 , 20 ,  30},
                {11 , 22  , 33}
                };


        System.out.println("twoD.length = " + twoD.length);  // returns row numbers - inner array count

        System.out.println("twoD[0].length = " + twoD[0].length);  // print length for 1 inner array

        System.out.println("twoD[0].length = " + twoD[1].length); // print length for 2 inner array
    }
}
