package com.srinivas.CSVFileReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Way1BufferedReader {
    public static void main(String[] args) {
        String file="src/main/resources/employees.csv";
        try{
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String line;

            while ((line=bufferedReader.readLine())!=null){
                String data[]=line.split(",");
                for(String e:data){
                    System.out.print(e+" ");
                }
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
