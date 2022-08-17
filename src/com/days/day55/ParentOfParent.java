package com.days.day55;

public class ParentOfParent  {

    int number;

    public ParentOfParent() {
        System.out.println("Parents of Parent Default Cons");
    }

    public ParentOfParent(int number) {
        System.out.println("Parents of Parent Param Cons");
        this.number=number;
    }
}
