package com.JAVA;
import java.util.Scanner;

public class Reverse_String3 {
    public static void main(String args[]){
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String: ");
        str = scan.nextLine();
        System.out.println(str);
        String[] split = str.split("");
        for (int i=split.length-1; i>=0; i--){
            System.out.print(split[i]);
        }
    }


}
