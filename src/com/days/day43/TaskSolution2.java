package com.days.day43;

import java.util.Arrays;
import java.util.List;

public class TaskSolution2 {

    public static void main(String[] args) {

        
        String[] a= {"A","B","C"};
//
//        a[0] = null;
//        a[1] = "asd";
//        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));


//        System.err.println("DANGER");
      //  System.out.println(a.length);

        System.out.println("ArrayInsertValue: " + Arrays.toString(arrayInsertValue(a, "Test", 1)));
    }


    /* Q-2
    For given array , create a method and try to add given value for given index!!

      Sample: String []a = {"Honda","BMW","KIA","TET","ASD","BBB"};
      arrayInsertValue(1,"KiaNiro") --> return an array->  {"Honda","KiaNiro", "BMW","KIA","TET","ASD","BBB"}
      
Sample given array: a[]= {A,B,C}
Test Scenarios:
1- what if newElement == null , index= 1                      -> Exp Result: {A,null,B,C}
2- what if given Array == null , new element:0 "D", index:0   -> Exp Result: null
3- what if given new element index > array.length or index<0  -> Exp Result: return same array with error message
4- element = "D" , index= 3                                   -> Exp Result: {A,B,C,D}
5- what if given Array = blank , element = "D" , index= 0     -> Exp Result: {D}
6- what if given Array = blank , element = "D" , index> 0     -> Exp Result: return same array with error message
7- element = "D" , index= 0                                   -> Exp Result: {D,A,B,C}
8- element = "D" , index= 1                                   -> Exp Result: {A,D,B,C}
     */


    public static String[] arrayInsertValue(String[]array, String newElement, int indexOfNewElement) {

        if (array == null ){
            System.err.println("Given Array is null!");
            return null;
        } else if (indexOfNewElement>array.length || indexOfNewElement<0){ // to handle Scenario 3
            System.err.println("Given index is INVALID!!");
            return array;
        }

        String [] returnArray= new String[(array.length+ 1)];

        int returnIndex=0;
        boolean flag = true;
        // {A,B,C}   givenI=1, "D"   {A,D,B,C}


        if(array.length==0){  // if array is blank - To handle Scenario-5
            returnArray[0]= newElement;
           return returnArray;
        }

        if(array.length == indexOfNewElement ){   // To handle Scenario -4
            for (int i = 0; i < returnArray.length; i++) {
               if(i<returnArray.length-1){
                   returnArray[i] = array[i];
               } else {
                   returnArray[i]= newElement;
               }
            }
            return returnArray;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("LOOP Iteration Start Point: i:" +i +", returningIndex: "+returnIndex);

            if((i == indexOfNewElement) && flag){
                System.out.println("  IF->  i:" +i +", returningIndex: "+returnIndex);
                returnArray[returnIndex] = newElement;
                i--;
                flag = false;
            } else{
                System.out.println("    ELSE->  i:" +i +", returningIndex: "+returnIndex);
                returnArray[returnIndex] = array[i];
            }
            returnIndex++;
        }

        return returnArray;
    }
}
