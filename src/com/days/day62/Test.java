package com.days.day62;

import com.days.day61.DataForProject;

public class Test {
    public static void main(String[] args) {
        Lorry lorry = new Lorry("RedLorry");
        lorry.increaseSpeed();
        lorry.moving();
        System.out.println("lorry.name = " + lorry.name);
        Plane plane = new Plane("Passenger Plane");
        plane.moving();
        System.out.println("DataForProject.city = " + DataForProject.city);
        //Playing.city = "London";  will give error because all the fields that we have created in the interface
        // are final and static


    }
}
