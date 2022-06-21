package com.days.day30;

public class Car {// outer class

    int year;
    String color;

    public void moving() {

        System.out.println("car is moving ");
    }


    public class Electricty {// inner class

        boolean isElectric;
        int price;

        public  void main(String[] args) {
            Car myCar = new Car();// creating an object from outer class
            myCar.color = "Black";
            myCar.moving();
            Electricty electricCar = myCar.new Electricty();// via outer class object i can create an object from inner class
            electricCar.price = 2000;

        }

        public void buy() {
            System.out.println("bought a new electric car");
        }


    }


}
