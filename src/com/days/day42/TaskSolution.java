package com.days.day42;

import java.util.Arrays;

public class TaskSolution {

    public static void main(String[] args) {

//        String []a = {"Honda",null,"KIA","KIA","ASD","BBB"};
        String []a = {"KIA","KIA"};


        System.out.println(Arrays.toString( arrayValueDelete(a, "KIA")));
    }


    /* Q-1
    For given array , create a method and try to delete given value !!

      Sample: String []a = {"Honda","BMW","KIA","TET","ASD","BBB"};
      arrayValueDelete(a,"KIA") --> return an array-> {"Honda","BMW","TET","ASD","BBB"}

           Scenario 1- 1 matched key then find and delete it, and return remaining strings
          +  Scenario 2- 0 matched key then return same array!! (Check empty array as well!!)
            Scenario 3- n>1 matched key then find all and delete them, and return remaining strings
          +  Scenario 4- if input array is null then return NULL;
            Scenario 5- case sensitivity data!! "kia" -> will NOT delete!!
          +  Scenario 6- what if given key str is null!!
           + Scenario 7- What if array has null element!!
          +  Scenario 8- What if array has null element + key also null!!
          Scenario 9- What if I only 1 element in given array and it is key ; expected result: empty array should return
     */

    public static String[] arrayValueDelete (String []array, String key){

//        0- Handle negative scenarios !!! NULL / EMPTY  - Scenario 4,

       if ((array==null) || (array.length==0) ) {
           System.out.println("Array is NULL/Empty! PLEASE PROVIDE A VALID INPUT!!");
           return null;
        }

//        1- create a loop to find "key" counts in given array

        int keyCounts=0;

        for (String s : array) {
            if( s == key){  //don't use this one: key.equals(s) because of null key!! // s.equals(key)  because of null s (element of array)!!   // Scenario-7,8
               keyCounts++;
            }
        }


        // check key before 2. loop!!  - Scenario-2,6
        if (keyCounts == 0 ){
            System.out.println("There is no "+ key + " match in given array!!");
            return array;
        }


//        2- create a new array for return, use count as size array

        String [] returnArray= new String[array.length - keyCounts];

        int index=0;
        for (String s : array) {
            System.out.println("s = " + s);
            if (s != key){
                System.out.println("Index number: "+ index);
                returnArray[index]=s;
                index++;
                System.out.println("after inc index = " + index);
            }
            System.out.println("End of iteration for "+ s);
        }

        return returnArray;
    }



     /* Q-2
    For given array , create a method and try to add given value for given index!!

      Sample: String []a = {"Honda","BMW","KIA","TET","ASD","BBB"};
      arrayValueDelete(1,"KiaNiro") --> return an array->  {"Honda","KiaNiro", "BMW","KIA","TET","ASD","BBB"}

     */

}
