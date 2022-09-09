package com.days.day72;

public class BankAccount {

    private String name;
    private int amountMoney;
    private String city;
    private int age;
    private int birthYear;

    BankAccount(String name, int deposit, String city, int birthYear) {
        this.name = name;
        amountMoney = deposit;
        this.city = city;
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }


    public void setAge(int age) {
        if (age < 18 || age > 100) {
            age = 30;
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getAmountMoney() {
        return amountMoney;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }
}

class BankTest {


    public static void main(String[] args) {
        BankAccount user1 = new BankAccount("Ronaldo", 999999, "Madrid",1980);
        int amount1 = user1.getAmountMoney();
        System.out.println("amount1 = " + amount1);
        user1.setCity("Roma");
        String city1 = user1.getCity();
        System.out.println("city1 = " + city1);
        System.out.println("user1.getAge() = " + user1.getAge());
        user1.setAge(600);
        System.out.println("user1.getAge() = " + user1.getAge());
        System.out.println("user1.getYear() = " + user1.getBirthYear());

    }
}
