package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileExtension {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String dir=sc.nextLine();
        try {
            File directory = new File(dir);

            // list all files present in the directory
            File[] files = directory.listFiles();
            System.out.println("Files\t\t\tExtension");

                for(File file : files) {
                    // convert the file name into string
                    String fileName = file.toString();

                    int index = fileName.lastIndexOf('.');
                    if(index > 0) {
                        String extension = fileName.substring(index + 1);
                        System.out.print( extension+",");
                    }
                }
        }
        catch (Exception e){
            System.out.println("Not Found  "+e);
        }
    }






        }

