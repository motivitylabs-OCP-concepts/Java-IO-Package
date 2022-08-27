package com.motivity.characterStream.classes;

import java.io.*;

public class OutputStreamWriterExample {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("output.txt");
        Writer outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write("Hello World");
        outputStreamWriter.close();
        System.out.println("Success");
    }
}
