package com.motivity.bytestream.classes;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInputStreamExample{
    public static void main(String[] args) throws IOException {
        // Creates a FileInputStream
        FileInputStream file = new FileInputStream ("output.txt");
        // Creates a BufferedInputStream
        BufferedInputStream input = new BufferedInputStream (file);
        // Reads first byte from file
        int i = input.read ();
        while (i != -1)
        {
            System.out.print ((char) i);
            // Reads next byte from the file
            i = input.read ();
        }
        input.close ();
    }
}
