package com.srinivas.CSVFileReader;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class Way3OpenCsv {
    public static void main(String[] args) {
        try {
            String path="src/main/resources/employees.csv";
            CSVReader reader=new CSVReader(new FileReader(path));
            String data[];
            while ((data=reader.readNext())!=null){
                for(String e:data){
                    System.out.print(e+", ");
                }
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
