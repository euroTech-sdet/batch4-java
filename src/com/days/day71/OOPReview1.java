package com.days.day71;

import java.util.Scanner;

public class OOPReview1 {


    int idValue;

    String caseName;

    String caseAddress;

    int caseStatusCode;

    public OOPReview1() {  // default cons!!
    }

    public OOPReview1(int idValue, String caseName, String caseAddress, int caseStatusCode) {
        this.idValue = idValue;
        this.caseName = caseName;
        this.caseAddress = caseAddress;
        this.caseStatusCode = caseStatusCode;
    }

    public static void main(String[] args) {

        OOPReview1 obj = new OOPReview1(10001, "testCase", "case/internal/local", 1343);

        OOPReview1 obj2 = new OOPReview1();

//        Scanner scanner = new Scanner(System.in);
//
//        scanner.hasNext()



    }
}
