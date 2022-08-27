package com.motivity.SerializationDeseralization.serializable.in;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataSave {

    public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {
        String sDate1="31/11/1989";
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        Employee employee=new Employee("hari",date1,"production","mechanical",5000);

        File file=new File("employedata.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(employee);
        System.out.println("saved success");
        FileInputStream fileInputStream= new FileInputStream(file);
        ObjectInputStream inputStream= new ObjectInputStream(fileInputStream);
        Employee employee1= (Employee) inputStream.readObject();

        System.out.println( employee1.toString());
    }
}
