package com.days.day61;


import java.io.*;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
        writer.write("Hello Java ,\n the weather is very hot \n but we are still trying to study  \n Java");
        writer.close();
        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line);
            content.append(System.lineSeparator());
        }

        System.out.println(content.toString());




    }
}
