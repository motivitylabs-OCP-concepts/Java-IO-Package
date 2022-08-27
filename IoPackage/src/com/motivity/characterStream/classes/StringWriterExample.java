package com.motivity.characterStream.classes;

import java.io.IOException;
import java.io.StringWriter;

public class StringWriterExample {
    public static void main(String[] args) {
        String data = "This is the text in the string.";
        try {
            // Create a StringWriter with default string buffer capacity
            StringWriter output = new StringWriter();
            // Writes data to the string buffer
            output.write(data);
            // Prints the string writer
            System.out.println("Data in the StringWriter: " + output);
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}