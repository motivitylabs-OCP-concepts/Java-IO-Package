package com.motivity.bytestream.classes;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.IOException;

public class ByteOutputStreamExample {
    public static void main(String[] args) throws IOException {
        String sequence=" welcome to motivity labs data store in string format  " ;
      //create byte output stream
        ByteOutputStream byteOutputStream=new ByteOutputStream();
        byte [] bitedata =sequence.getBytes();
        byteOutputStream.write(bitedata);

        byteOutputStream.flush();
        String streamData = byteOutputStream.toString();
        System.out.println("Output stream : " + streamData);
        byteOutputStream.close();

    }
}
