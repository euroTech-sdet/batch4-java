package com.days.day72;

public interface Person {

    int century = 21;

    void eating(Fruit fruit);

    void sleeping();

}

interface Identity {
    String country = "Germany";

    void born();
}

class Employee implements Person, Identity {


    @Override
    public void eating(Fruit fruit) {
        System.out.println("eating " + fruit.name);
    }

    @Override
    public void sleeping() {
        System.out.println("employees are sleeping less than 5 hours");
    }

    @Override
    public void born() {
        System.out.println("was born in" + Identity.country);
    }

}


class TestInterface {
    public static void main(String[] args) {
        Employee boss = new Employee();
        boss.eating(new Apple());
        boss.born();
        System.out.println("Person.century = " + Person.century);
        //  Person.century = 22; all the variables inside the interfaces are final and static
        // a class can extend only 1 class but many interfaces
    }

}