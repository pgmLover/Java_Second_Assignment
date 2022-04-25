
// pig Latin Translator
package com.company;

import java.util.*;

//import java.util.Date;-
public class Main {
    public static void main(String[] args) {


Scanner sc= new Scanner(System.in);
String name=sc.nextLine();

List <Character> li=new ArrayList<Character>();
for (int i=0; i<name.length();i++){
    li.add(name.charAt(i));
}
li.add(li.get(0));
li.add('a');
li.add('y');
li.remove(0);
String pig="";
for(char j:li){
     pig +=j;
}
System.out.println(pig);
    }
}

/*

public class Main {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        String word=sc.nextLine();
        System.out.print(word+"\n");
        char[] ch=word.toCharArray();
 int length=word.length();
        System.out.print(length);
	    }
}
*/