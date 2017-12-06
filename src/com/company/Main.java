package com.company;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //InputStream inputStream = new URL("https://google.com").openStream();
        File file = new File("D:\\Humster.txt");
        InputStream inputStream = new FileInputStream(file);
       /*Scanner scanner = new Scanner(System.in);
       String str = scanner.nextLine();
        InputStream inputStream = str;*/

        OutputStream outputStream = System.out;

        copy(inputStream, outputStream);
       // write(inputStream, outputStream);


    }

    /*private static void write(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] buff = new byte[64 * 1024];
        FileWriter fileWriter = new FileWriter("D:\\test.txt");
        while (inputStream.available()>0){
            int count =inputStream.read(buff);
            fileWriter.write(count);
            fileWriter.flush();
            fileWriter.close();
        }



    }*/

    private static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] buff = new byte[64 * 1024];
        while(inputStream.available()>0){
            int count = inputStream.read(buff);
            outputStream.write(buff, 0, count);
        }
        inputStream.close();
        outputStream.close();
    }
}
