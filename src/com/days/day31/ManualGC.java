package com.days.day31;

public class ManualGC {
    protected void finalize() throws Throwable {
        System.out.println("garbage collector");
        super.finalize();

    }

    public static void main(String[] args) {


        ManualGC man = new ManualGC();
        man = null;
        System.gc();
    }
}
