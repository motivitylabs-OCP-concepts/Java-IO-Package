package com.motivity.characterStream.classes;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExamples {
    public static void main(String[] args) throws FileNotFoundException {
        String data = "This is a line of text inside the file.";
        PrintWriter output = new PrintWriter("input.txt");
        output.print(data);
        output.close();
        System.out.println("Success?");
    }
}
