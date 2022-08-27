package com.motivity.bytestream.classes;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream {
    public static void main(String[] args) throws IOException {
        String data = "Hello World";
        // Creates an output stream
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] array = data.getBytes();
        out.write(array);
        // Retrieves data from the output stream in string format
        String streamData = out.toString();
        System.out.println("Output stream: " + streamData);

        out.close();
    }
}
