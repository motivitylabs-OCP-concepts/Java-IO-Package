package com.motivity.characterStream.classes;

import java.io.*;

public class InputStreamReaderExample {
    public static void main(String[] args) throws IOException {
        InputStream stream = new FileInputStream("output.txt");
        Reader reader = new InputStreamReader(stream);
        int data = reader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = reader.read();
        }
    }
}
