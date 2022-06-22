package com.days.day30;

public class GarbageCollection {

    protected void finalize() throws Throwable {



        System.out.println("garbage collector is working");
        super.finalize();

    }

    public static void main(String[] args) {
        String city = new String("Oslo ");
        System.out.println("city = " + city);
        city = null;
        System.out.println("city = " + city);
        System.gc();
        int number = 20;
        System.gc();
        city = new String("Oslo ");
        city = null;
        String country = new String("America");
        country = "France";

        String language = "Java";
        String str = "Evening";
        String programmingLang = "Java";
        String pro = new String("Java");
        System.out.println(pro == language);
        String pro2 = "Java";
        System.out.println(pro2 == language);
        GarbageCollection gb=new GarbageCollection();
        gb=null;
        gb=new GarbageCollection();
        gb=null;
        System.gc();



    }
}
