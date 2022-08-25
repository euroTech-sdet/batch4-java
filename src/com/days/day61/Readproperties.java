package com.days.day61;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readproperties {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("config.properties");
        Properties properties = new Properties();
        properties.load(file);
        System.out.println("username = " + properties.getProperty("username"));
        System.out.println("p(\"url\") = " + properties.getProperty("url"));
        System.out.println("(\"name\") = " + properties.getProperty("name"));
        System.out.println("(\"password\") = " + properties.getProperty("password"));
        System.out.println("(\"adminuser\") = " + properties.getProperty("adminuser"));


    }
}
