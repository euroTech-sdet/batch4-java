package com.days.day53;

import java.util.ArrayList;

public class JavaSchool {

    //  It is unique value for each student.
    // Parent can see it, but should not change it!!
    // Admin members able to change it via password!!
    private int studentId;

    // Parent can see it, but should not change it directly!!
    // Parent can change only with extra permission
    private String studentFullName;

    // Parent can see it, and should change it!!
    public String parentEmailAddress;

    // Parent can see it, but should not change it directly!! Parent can change only with extra permission
    private String parentFullName;

    // Parent can see it, but should not change it!! it will be automatically calculate from the grade system
    private double seasonGrade;  //--> Read only DATA!!

    // Parent can see it, but should not change it!! it will be automatically calculate from the the system
    private int absentDays;  //--> Read only DATA!!

    // Parent should not see and change them!!
    private ArrayList<String> privateNotes= new ArrayList<>();

    // Parent should not see and change them!!
   private static int studentCount= 1000;  // No getter no setter!!!


    public JavaSchool( String studentFullName, String parentEmailAddress, String parentFullName) {  // student
        studentCount++;
        this.studentId = studentCount;
        this.studentFullName = studentFullName;
        this.parentEmailAddress = parentEmailAddress;
        this.parentFullName = parentFullName;

        System.out.println("Welcome our JAVA School!! ");
        System.out.println("Total Student number: "+ (studentCount-1000));
    }

    // GETTER :
    public int getStudentId () {
        return this.studentId;
    }

    public String getStudentFullName(){
        return this.studentFullName;
    }

    public String getParentFullName() {
        return this.parentFullName;
    }

    public double getSeasonGrade(){
        return this.seasonGrade;
    }

    public int getAbsentDays() {
        return absentDays;
    }



    // SETTER :

    public void setStudentId(String password, int studentId){
        if(password.equals("admin")){
            this.studentId = studentId;
        } else{
            System.out.println("You are not authorize to set Student id !!!");
        }
    }

    public void setStudentFullName (boolean permission, String studentFullName){
        if (permission){
            this.studentFullName = studentFullName;
        } else{
            System.out.println("You are not authorize to set Student name !!!");
        }
    }

    public void setParentFullName(boolean permission, String parentFullName) {
        if (permission){
            this.parentFullName = parentFullName;
        } else{
            System.out.println("You are not authorize to set Student name !!!");
        }

    }


}
