package com.days.day27;

public class LoopSample {

    public static void main(String[] args) {


        for (int i=1 ; i<=4; i++ ){ // 1. Loop is responsable to create/jump next ROW!!


            for(int j=1; j<=(5-i); j++) {  // 2. loop -> print * depends on formula!!!
                System.out.print("*");
            }
            System.out.println();
        }


        int n= 10;
        for (int i=1 ; i<=n; i++ ){ // 1. Loop is responsable to create/jump next ROW!!


            for(int j=1; j<=(n+1-i); j++) {  // 2. loop -> print * depends on formula!!!
                System.out.print("*");
            }
            System.out.println();
        }



        n= 10;

        for (int i = 1; i<n; i++){  // 1. loop her each line/row


            for(int j=1; j<(n+1-i);j++) {  // 2. loop  to print space for each line!!!
                System.out.print(" ");
            }

            for(int k=1; k<= (2*i-1); k++) {  // 3. loop to print * for each line!!!
                System.out.print("*");
            }

            System.out.println();


        }


    }
}
