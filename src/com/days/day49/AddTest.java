package com.days.day49;

public class AddTest {
    public static void main(String[] args) {
        Add oprtion = new Add();
        Add oprtion1 = new Add();
        oprtion.getSum(10, 40);
        oprtion1.getSum1(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Person per1 = new Person("David", 1990);
        Person per2 = new Person("Benzema");
        Person per3 = new Person("Ronaldinho");
        Person per4 = new Person("Halil");
        per1.name = "David";
        per2.name = "Ronaldo";
        per3.name = "Ahmet";
        per1.printName();
        per2.printName();
        per3.printName();
        per4.printName();
        System.out.println("per4.surname = " + per4.surname);
        System.out.println("per3.surname = " + per3.surname);
        per1.calculateAge();
        int per1Age = per1.getAge();
        System.out.println("per1Age = " + per1Age);
        per2.birthYear = 2000;
        per2.calculateAge();
        per3.birthYear = 2010;
        per3.calculateAge();
//        System.out.println("per1.city = " + per1.city);
//        System.out.println("per2.city = " + per2.city);
//        per1.city="Berlin";
//        System.out.println("per1.city = " + per1.city);
        per1.anotherGetForCity();// city == munich for per1
        per1.getCity();

        Teacher teacher1 = new Teacher(per1);
        System.out.println("teacher1.name = " + teacher1.name);
        teacher1.printName(per1);
        per1.anotherGetForCity();// city== oslo for per1
        per2.anotherGetForCity();// city== munich for per2

    }
}
