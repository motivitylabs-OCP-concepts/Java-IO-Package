package com.motivity.bytestream.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream=new FileInputStream("dataholder.txt");
        System.out.println("data inside file : ");

        System.out.println("estimate the bytes inside the file : "+inputStream.available() );
        int cha=inputStream.read();
        while (cha !=-1)
        {
           // inputStream.skip(5);//it skips the specified bytes
            System.out.print((char) cha);
            cha=inputStream.read();
        }
        inputStream.close();
    }

}
