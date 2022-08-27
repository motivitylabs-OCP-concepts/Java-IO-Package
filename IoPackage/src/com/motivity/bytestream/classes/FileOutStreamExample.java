package com.motivity.bytestream.classes;

import java.io.*;

public class FileOutStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream=new FileOutputStream("dataholder.txt",true);

        DataInputStream dataInputStream=new DataInputStream(System.in);
          char ch;
          String data;
        System.out.println("Enter character data and enter * to save ");
       ch=(char)dataInputStream.read();
       while (ch !='*')
        {
            outputStream.write(ch);
            // releasing the resource
            ch=(char)dataInputStream.read();
            outputStream.close();
            dataInputStream.close();
        }

    }
}
