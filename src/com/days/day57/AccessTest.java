package com.days.day57;


import com.days.day56.Employee;
import com.days.day56.Person;
import com.days.day56.Player;
import com.days.day56.Student;

public class AccessTest {
    public static void main(String[] args) {
        Person person = new Person("Michael");
        System.out.println("person.name = " + person.name);
        person.printName();

        Student student = new Student();

        Employee employee = new Employee("Ronaldo");

        Worker worker = new Worker("Benzema");

//        Player player = new Player("Michael","Chicago Bulls");


    }
}
