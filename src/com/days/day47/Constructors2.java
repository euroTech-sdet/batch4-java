package com.days.day47;

public class Constructors2 {

    int idNumber;

    String name;

    int refValue;

    boolean isActive;

    char code;

    static int count;





    public Constructors2(){

        System.out.println("default cons");
    }

    public Constructors2(int idNumber) {
        this();
        this.idNumber = idNumber;
        System.out.println("1 param cons");

    }

    public Constructors2(int idNumber, String name) {
        this(idNumber);
        this.idNumber = idNumber;
        this.name = name;
        System.out.println("2 params cons");
    }



    public Constructors2(int idNumber, String name, int refValue, boolean isActive, char code ) { //int count
        this.idNumber = idNumber;
        this.name = name;
        this.refValue = refValue;
        this.isActive = isActive;
        this.code = code;
//        this.count = count;
    }

    public static void main(String[] args) {


//        Constructors2 test1= new Constructors2(1, "test1", 10001, true, 'T');
//
//        System.out.println("test1.name = " + test1.name);


     //   Constructors2 test1 = new Constructors2();

    //    Constructors2 test2 = new Constructors2(1001);

        Constructors2 test3 = new Constructors2(1001, "Hursit");







    }
}
