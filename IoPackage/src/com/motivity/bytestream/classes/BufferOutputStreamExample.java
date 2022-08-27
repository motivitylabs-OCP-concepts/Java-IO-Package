package com.motivity.bytestream.classes;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("output.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Welcome to Java Programming Language.";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("successfully written data");
    }
}
