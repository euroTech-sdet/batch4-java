package com.days.day69;

public class School {

    String schoolName;
    String managerName;
    static int schoolCount;
    int schoolNumber;
    int hourCount = 10;

    School(String directorName, String schoolName) {
        schoolCount++;
        schoolNumber = schoolCount;
        managerName = directorName;
        this.schoolName = schoolName;
        System.out.println("you have created an object from school class");
        System.out.println("how many school created from this school " + schoolCount);
    }

    public void working() {

        System.out.println("manager " + managerName);
        System.out.println(managerName + " is working" + hourCount + " in a day");
    }

    public void schoolInfo() {
        System.out.println("schoolName = " + schoolName);
        System.out.println(schoolName + " is the " + schoolNumber + ".  school created from school class");
    }

    public static void classInfo() {
        System.out.println("schoolCount = " + schoolCount);
    }


}

class Test {

    public static void main(String[] args) {
        School londonHighSchool = new School("Benzema", "London High School");// when we create an object, java allocate an area in the heap memory for this object
        londonHighSchool.working();
        School cambridge = new School("Ronaldo", "Cambridge");
        cambridge.working();
        londonHighSchool.schoolInfo();
        cambridge.schoolInfo();
        School.classInfo();
    }
}
