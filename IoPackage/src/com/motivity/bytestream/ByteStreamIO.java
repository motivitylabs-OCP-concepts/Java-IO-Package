package com.motivity.bytestream;

import java.io.*;

public class ByteStreamIO {
    public static void main(String[] args) throws IOException {
        String bytearray[]={"a","b","c","d"};
       int bytearray1[]={10,20,30,40};
      // int age=10;

        OutputStream outputStream=new FileOutputStream("filedata.txt");
//outputStream.write(age);//write number data
        for(int i=0;i<bytearray.length;++i)
        {
            outputStream.write(bytearray1[i]);//it will Write the specified byte to this output stream
            outputStream.write(bytearray[i].getBytes());//it will convert to byte array
           // System.out.println(bytearray[i]);
        }
        System.out.println("data written on the file successfully");
        outputStream.close();
        InputStream inputStream=new FileInputStream("filedata.txt");
        int size=inputStream.available();
        System.out.println(size);
        for(int i=0;i<size;++i)
        {
            System.out.print( inputStream.read()+" , ");
        }
inputStream.close();

    }
}
