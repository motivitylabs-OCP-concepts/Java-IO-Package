package com.motivity.bytestream.classes;

import java.io.*;

public class ObjectIOStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int data1 = 5;
        String data2 = "The ObjectInputstream is mainly used to read data written by the ObjectOutputstream. Basically, the ObjectOutputstream converts Java objects into corresponding streams. This is known as serialization";
        FileOutputStream outputStream=new FileOutputStream("objectdata.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
        // Writing to the file using ObjectOutputStream
       objectOutputStream.writeInt(data1);
        objectOutputStream.writeObject(data2);

        //*********************** ObjectInputStream ****************************
        FileInputStream fileStream = new FileInputStream("objectdata.txt");
        // Creating an object input stream
        ObjectInputStream objStream = new ObjectInputStream(fileStream);
        //Using the readInt() method
        System.out.println("Integer data :" + objStream.readInt());
        // Using the readObject() method
        System.out.println("String data: " + objStream.readObject());
        outputStream.close();
        objStream.close();

    }
}
