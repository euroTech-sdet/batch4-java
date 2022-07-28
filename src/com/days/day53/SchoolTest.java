package com.days.day53;

public class SchoolTest {


    public static void main(String[] args) {


        JavaSchool student1 = new JavaSchool("Junior Murat", "test@tt.com", "Baba Murat"  );  // Student 1

        // Act as parent
        System.out.println("student1.getStudentId() = " + student1.getStudentId());
        student1.setStudentId("parent", 111);
        System.out.println("student1.getStudentId() = " + student1.getStudentId());
        student1.parentEmailAddress = "newEmail@test.com";
        System.out.println("student1.parentEmailAddress = " + student1.parentEmailAddress);
        System.out.println("student1.getAbsentDays() = " + student1.getAbsentDays());
        student1.setParentFullName(true,"Mrs. BABA");
        System.out.println("student1.getParentFullName() = " + student1.getParentFullName());


        // Act as system admin
        student1.setStudentId("admin", 101);
        System.out.println("student1.getStudentId() = " + student1.getStudentId());


        JavaSchool student2 = new JavaSchool("Johny Cash", "test2@tt.com", "Baba Cash"  );  // Student 2

        System.out.println("student2.getStudentId() = " + student2.getStudentId());


        System.out.println("ReviewStatic.count = " + ReviewStatic.count);
    }
}
