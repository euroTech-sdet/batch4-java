package com.days.day41;

import java.util.Arrays;
import java.util.Random;

public class Review_MultiDArrays {


    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}

        };


        System.out.println(Arrays.deepToString(matrix));

        System.out.println("Arrays.deepToString(return2DarrayRandomly(10)) = " + Arrays.deepToString(return2DarrayRandomly(10)));

    }



    public static int[][] return2DarrayRandomly(int maxNumber) {
        Random random = new Random();
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(maxNumber + 1);
            }
        }

        return array;

    }
}
