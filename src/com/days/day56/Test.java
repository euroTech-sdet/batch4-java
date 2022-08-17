package com.days.day56;

public class Test {
    public static void main(String[] args) {
        AccessModifiers access = new AccessModifiers();
        System.out.println("access.name = " + access.name);
        Person person = new Person("David");
        System.out.println("person.name = " + person.name);
        person.printName();

        Student student = new Student();

        Employee employee = new Employee("Benzema");
        employee.printName();

        Player player = new Player("Kobe", "La Lakers");
        player.printTeam();

        System.out.println("Person.city = " + Person.city);
        Person.printCity();
        Employee.printCity();
        System.out.println("Player.clubName = " + Player.clubName);
    }
}
