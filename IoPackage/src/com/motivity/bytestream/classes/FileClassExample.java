package com.motivity.bytestream.classes;

import java.io.File;

public class FileClassExample {
    public static void main(String[] args) {
        File f = new File ("output.txt");
        if (f.exists ())
        {
            System.out.println ("Existed:" + f.exists ());
            System.out.println ("File:" + f.isFile ());
            System.out.println ("Directory:" + f.isDirectory ());
            System.out.println ("Readable:" + f.canRead ());
            System.out.println ("Writable:" + f.canWrite ());
            System.out.println ("Path:" + f.getPath ());
            System.out.println ("Absolute Path:" + f.getAbsolutePath ());
            System.out.println ("size:" + f.length () / 1024 + "KB");
        }
        else
        {
            System.out.println ("File is not available");
        }
    }
}
