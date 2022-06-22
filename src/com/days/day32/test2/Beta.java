package com.days.day32.test2;

import com.days.day32.test1.test1inner.Alfa;


import static com.days.day32.test1.test1inner.Alfa.testStaticMet;

public class Beta {

    public static void main(String[] args) {
        System.out.println("This is console");
    }



    public void test2method(){

        Alfa test= new Alfa();
        test.test1InnerMethod();

    }


}
