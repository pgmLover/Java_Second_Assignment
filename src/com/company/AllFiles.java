package com.company;

import java.io.File;
import java.util.Scanner;

public class AllFiles {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String path=sc.nextLine();
        try {
            File dir = new File(path);

            File[] files=dir.listFiles();
            for(File file: files){
                String fileName=file.toString();
                System.out.println(fileName);
            }
        }
        catch (Exception ex){
            System.out.println("Error" + ex);
        }
    }

}
