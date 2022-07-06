package com.days.day40;

import java.util.Arrays;

public class RaggedArray {

    public static void main(String[] args) {


        int [][] ragArray= new int[3][];
      //  int [] array1= new int[]; -- compile time error!!

        ragArray[0]= new int[3];
        ragArray[0][0]=1;
        ragArray[0][1]=2;
        ragArray[0][2]=3;

        ragArray[1]= new int[2];
        ragArray[1][0]=4;
        ragArray[1][1]=5;

        ragArray[2]= new int[1];
        ragArray[2][0]=6;




        System.out.println(Arrays.deepToString(ragArray));


        int [ ][ ] array  = new int[5][6];
        int[ ] x = {1, 2};
        array[0] = x;
        System.out.println("array[0][1] is " + array[0][1]);  // 2
       // System.out.println("array[0][1] is " + array[0][2]);  // ? ArrayIndexOutOfBoundsException


        int y [ ]  = {1, 2,3,4,5,6,7,8};

            array[0] = y;
        System.out.println("array[0][1] is " + array[0][3]);



        int test[][]= {{7,8}};  //new int [1][2]

        System.out.println(Arrays.toString(test[0])); // [7,8]
        System.out.println(Arrays.toString(test[1]));// throws ArrayIndexOutOfBoundsException



    }
}
