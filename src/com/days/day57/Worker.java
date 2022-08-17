package com.days.day57;

import com.days.day56.Employee;

public class Worker extends Employee {


    Worker(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Worker worker = new Worker("Michael");
        worker.printName();
        Employee.printCity();
    }


}
