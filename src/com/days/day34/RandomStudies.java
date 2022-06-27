package com.days.day34;

import java.util.Random;

public class RandomStudies {

    public static void main(String[] args) {

        Random random = new Random();

        System.out.println(random.nextInt());

        int randomValue = random.nextInt();
        System.out.println("randomValue = " + randomValue);


        int random10 = random.nextInt(11); // 0 - 10 (inc)
        System.out.println("random10 = " + random10);


        double randomDouble = random.nextDouble(); // 0.0(inc) <= x < 1.0 (exc)
        System.out.println("randomDouble = " + randomDouble);



        // 1000.99
        // (inc) 0.0<= number < 1001.0 (exc) return random DOUBLE value between these values!!!
        //                       <1.0 (exc)                 <= 1001 (inc)
        double randomNew = (random.nextDouble())*(random.nextInt(1002));
        System.out.println("randomNew = " + randomNew);


        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);




        // Calc random value betweem : -10<= x <= 10   --> high = 11. low = -10

        // random(high - min ) + min

        int randomRange = random.nextInt(11-(-10)) + (-10);
        System.out.println("randomRange = " + randomRange);
    }
}
