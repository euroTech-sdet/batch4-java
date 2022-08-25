package com.days.day60;

import java.util.ArrayList;

public class Univercity {
    ArrayList<Academician> listofAca = new ArrayList<>();
    ArrayList<Assistant> listofAssist = new ArrayList<>();

    Univercity(Academician academician, Assistant assistant) {
        academician.salary = academician.salary + 10000;
        assistant.salary = assistant.salary + 5000;
        listofAca.add(academician);
        listofAssist.add(assistant);

    }

}
