package com.motivity.characterStream.classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("output.txt");
        int i;
        while((i=fileReader.read())!=-1)
            System.out.print((char)i);
        fileReader.close();
    }
}
