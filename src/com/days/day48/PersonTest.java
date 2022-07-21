package com.days.day48;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("John", 1990);
        //  System.out.println("person1.name = " + person1.name);
        // person1.name = "Kobe";
        //  System.out.println(person1.name);
        System.out.println("person1.getName() = " + person1.getName());

        Person person2 = new Person("Henry", 1980);
        System.out.println("person2.getName() = " + person2.getName());
        int person1Age = person1.getAge();
        int person2Age = person2.getAge();


    }
}
