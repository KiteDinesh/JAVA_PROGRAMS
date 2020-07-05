package com.JAVA;
import java.util.Scanner;

public class Reverse_String4 {
    public static void main(String args[]){
        Scanner scan = new Scanner((System.in));
        String OriginalString, ReverseString="";
        System.out.println("Enter String: ");
        OriginalString = scan.nextLine();
        System.out.println(OriginalString);
        for (int i=OriginalString.length()-1; i>=0; i--){
            ReverseString = ReverseString+OriginalString.charAt(i);
        }
        System.out.println(ReverseString);
    }
}
