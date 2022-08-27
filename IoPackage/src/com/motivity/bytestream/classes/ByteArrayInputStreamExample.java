package com.motivity.bytestream.classes;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) {
        String str = " motivity labs data here ";
        byte arrbyte [] = str.getBytes();
        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(arrbyte);
        int ch;
        ch= byteArrayInputStream.read();
        while (ch !=-1)
        {
            System.out.print((char) ch);
            ch= byteArrayInputStream.read();
        }
    }
}
