package com.motivity.bytestream.classes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamExample{
    public static void main(String[] args) throws IOException {
        DataInputStream distream = new DataInputStream(System.in);
        System.out.println("Enter any string ");
        String str=distream.readLine();//parse data
        System.out.println("string data = "+str);
        System.out.println("Enter any Integer");
        int i= Integer.parseInt(distream.readLine()); //parsing int
        System.out.println("integer i="+i);

        /*
        FileOutputStream file = new FileOutputStream("input.txt");
        DataOutputStream out=new DataOutputStream(file);
        byte array = distream.readByte();
        out.write(array);*/


        distream.close();
    }
}
