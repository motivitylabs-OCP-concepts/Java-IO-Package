package com.motivity.characterStream;

import java.io.*;

public class CharacterStreamIo {
    public static void main(String[] args) throws IOException {
        File file=new File("characterFile.txt");

        FileWriter fileWriter=new FileWriter(file);
        String technology[]={"java","PHP","Python","DOTNET"};
        for (int i=0;i<technology.length;i++)
        {
            fileWriter.write(technology[i]);//write a characters
        }
        fileWriter.flush();
        fileWriter.close();

        FileReader fileReader=new FileReader("characterFile.txt");

       char data[]=new char[(int) file.length()];
       fileReader.read(data);
        System.out.println(fileReader.read(data));

        File file1=new File("copydatafile.txt");
        FileWriter fileWriter1=new FileWriter(file1);
        String technology1[]={"java","PHP","Python","DOTNET"};
        for (int i=0;i<technology1.length;i++)
        {
             fileWriter1.write(technology[i]);//copying reade file write a characters
        }
        fileWriter1.flush();
        fileWriter1.close();
    }
}
