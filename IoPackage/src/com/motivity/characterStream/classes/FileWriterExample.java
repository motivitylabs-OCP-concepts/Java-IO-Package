package com.motivity.characterStream.classes;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter ("output.txt");
        String str = "This time never come back";
        fw.write (str);
        char chars[] = str.toCharArray ();
        fw.write (chars);
        for (int i = 0; i < str.length (); i++)
        {
            fw.write (str.charAt (i));
        }
        fw.flush ();
        fw.close ();
        System.out.println ("Success");
    }
}
