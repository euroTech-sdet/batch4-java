package com.days.days29;

public class Cake {
    String cakeMaker;
    int slices = 20;
    boolean isChoclate;
    boolean isEgg;
    int weight;
    static int cakeSlicess = 10;

    public void eating() {
        slices--;// object this will change up to the object
        System.out.println(cakeMaker + " ' s cake slices = " + slices);
        cakeSlicess--;// class , this will nt cahnge up to the object
        System.out.println("cakeSlicess = " + cakeSlicess);// common cake is belong to class - home
    }


}
