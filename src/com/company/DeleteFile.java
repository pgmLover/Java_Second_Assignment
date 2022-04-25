package com.company;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String path=sc.nextLine();

        File dir=new  File(path);
        File[] files=dir.listFiles();
        for(File file : files){
            file.delete();
            System.out.println("Successfully Deleted "+file );
        }


    }
}
