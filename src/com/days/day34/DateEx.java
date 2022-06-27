package com.days.day34;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateEx {

    public static void main(String[] args) throws InterruptedException {

        Date date= new Date();

        System.out.println("date = " + date);

        System.out.println("date.getTime() = " + date.getTime());

      //  Thread.sleep(10000);


        System.out.println("date.getTime() = " + date.getTime());



        ////////////////////////


        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:s", Locale.ENGLISH).format(ldt));


    }
}
