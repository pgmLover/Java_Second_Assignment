package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckArray {

    public static void main(String[] args) {

        boolean out=true;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The String:");
        String str=sc.nextLine();
        List<Character> li= new ArrayList<Character>();
        for ( int i=0; i<str.length(); i++){
            li.add(str.charAt(i));
        }

        for(int i=0,j=li.size()-1; i<((li.size())/2)&& out  ;i++,j--){
            if(li.get(i)==li.get(j)){
                out=true;

            }
            else {
                out=false;
            }

        }

        if(out){
            System.out.println("Its palindrome");
        }
        else {
            System.out.println("Its NOT palindrome");

        }

    }
}
