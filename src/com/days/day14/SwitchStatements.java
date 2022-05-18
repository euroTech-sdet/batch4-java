package com.days.day14;

public class SwitchStatements {
    public static void main(String[] args) {
        //  >= > <= < !=
        if (10 > 5) {
            System.out.println("......");
        }

        // == check the equality

        int dayNumber = 2;

        switch (dayNumber) {
            case 1:
                System.out.println("today is monday");// statement
                break;
            case 3:
                System.out.println("today is wednesday");
                break;
            case 2:
                System.out.println("today is tuesday");
                break;
            case 4:
                System.out.println("today is thursday");
                break;
            case 5:   // use colon dont use semicolon
                System.out.println("today is friday");
                break;
            case 6:
                System.out.println("today is saturday");
                break;
            case 7:
                System.out.println("today is sunday");
                break;
            default:
                System.out.println("neither of the values match ");
        }
        System.out.println("after switch");
        String day = "";
        if (dayNumber > 0 && dayNumber < 8) {
            switch (dayNumber) {
                case 1:
                    day = "monday";
                    break;
                case 2:
                    day = "tuesday";
                    break;
                case 3:
                    day = "wednesday";
                    break;
                case 4:
                    day = "thursday";
                    break;
//                default:
//                    System.out.println("no matching");
            }
            System.out.println("today  is " + day);
        } else {
            System.out.println("no matching");
        }

        dayNumber = 4;
        switch (dayNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println(" weekdays");
                break;
            case 6:
            case 7:
                System.out.println("happy weekend");
                break;
            default:
                System.out.println("not matched");
        }



    }
}
