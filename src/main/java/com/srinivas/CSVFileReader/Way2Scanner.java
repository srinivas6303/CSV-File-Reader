package com.srinivas.CSVFileReader;

import java.io.File;
import java.util.Scanner;

public class Way2Scanner {
    public static void main(String[] args) {
        try{
            String path="src/main/resources/employees.csv";

            File file=new File(path);
            Scanner scanner=new Scanner(file);

            while(scanner.hasNextLine()){
                String line= scanner.nextLine();
                String data[]=line.split(",");
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
