package com.days.day60;

public class StaffTest {
    public static void main(String[] args) {
        Assistant assistant = new Assistant("Ronaldo", 1980);
        assistant.paymentCalculation();
        assistant.teaching(10);
        assistant.paymentCalculation();
        System.out.println("assistant.age = " + assistant.age);
        System.out.println("assistant.salary = " + assistant.salary);
        Academician academician = new Academician("Benzema", 1985);
        academician.paymentCalculation();
        academician.teaching(20);
        System.out.println("aca salary = " + academician.salary);
        System.out.println("assistant.title = " + assistant.title);

        Univercity univercity = new Univercity(academician, assistant);
        System.out.println("univercity.academician.salary = " + univercity.listofAca.get(0).salary);
        System.out.println("univercity.listofAssist.salary = " + univercity.listofAssist.get(0).salary);
        System.out.println("univercity.aca.title = " + univercity.listofAca.get(0).title);

    }
}
