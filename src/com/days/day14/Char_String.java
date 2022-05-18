package com.days.day14;

public class Char_String {
    public static void main(String[] args) {

        char grade = 'E';// ABC   success DE fail
        boolean result = true;
        String result2 = "";

        switch (grade) {
            case 'A':
                System.out.println("succesfull result");
                result2 = "Succesful";
                break;
            case 'B':
                System.out.println("succesfull result");
                result2 = "succesfull";
                break;
            case 'E':
                System.out.println("unsuccesfull result");
                result2 = "failure";
                break;
            default:
                System.out.println("no matching");
        }
        System.out.println("result2 = " + result2);

        String capital = "London";
        String country = "";
        String city = "London";

        // london  ankara roma madrid paris
        switch (capital) {
//            case city:// you cant use variable, you have to put value
            case "London":
                country = "Englannd";
//                System.out.println("london is capital of uk");
                break;
            case "Paris":
                country = "France";
                System.out.println("Parice is capital of france");
                break;
            case "Madrid":// use colon dont use semicolon here
                country = "Spain";
//                System.out.println("madrid is capital of spain");
                break;
            default:
                System.out.println("didnt match any city");
        }
        System.out.println(capital + " is capital  of " + country);

        int monthRow = 4;

        switch (monthRow) {
            case 2:
                System.out.println("february is the second month of the year");
                break;
            case 3:
                System.out.println("march is the third month of the year");
                break;
            case 4:
                System.out.println("april is the fourth month of the year");
                break;
            default:
                System.out.println("not matched with any month");
        }

        switch (monthRow){
            case 12:
                case 11:
                    case 2:
                        case 1:
                            System.out.println("season is winter");
                            break;
            case 3: case 4: case 5:
                System.out.println("season is spring");
                break;
            default:
                System.out.println("not matched for any season");
        }
        boolean b=false;
      //  switch (b){  // incomatible types for switch cases
            // suitable types  are byte  short char integer and String
      //  }




    }
}
