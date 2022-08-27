package com.motivity.bytestream.classes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout=new FileOutputStream("output.txt");
        PrintStream pout=new PrintStream(fout);
        pout.println(2020);
        pout.println("Hello Java");
        pout.println("Welcome to Java");
        pout.close();
        fout.close();
        System.out.println("Success?");
    }
}
