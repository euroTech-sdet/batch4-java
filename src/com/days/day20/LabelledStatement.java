package com.days.day20;

public class LabelledStatement {


    public static void main(String[] args) {
        int num1 = 2, num2 = 1;

        outer:
        do {
            label2:
            while (num1 > num2) {
                MuratsLoop:
                while (num2 > num1) {
                    while (num1 > num2) {
                        if (2 > 1) {
                            break MuratsLoop;
                        }
                    }
                }

            }

            //   break MuratsLoop; NO nonono can not stop inner ones!!
        } while (true);


    }
}
