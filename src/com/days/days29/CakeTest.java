package com.days.days29;

public class CakeTest {
    public static void main(String[] args) {
        Cake cake1 = new Cake();
        cake1.isChoclate = true;
        cake1.slices = 10;
        cake1.isEgg = true;
        cake1.weight = 2;
        cake1.cakeMaker = "Ahmet";
        Cake cake2=new Cake();
        cake2.cakeMaker="Murat";
        cake2.slices=20;
        cake2.weight=1;
        cake2.isEgg=false;

        cake1.eating();
        cake1.eating();
        cake2.eating();




    }
}
