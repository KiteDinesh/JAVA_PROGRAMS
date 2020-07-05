package com.JAVA;
import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String OriginalString,ReverseString="";
        OriginalString = scan.nextLine();
        for (int i=OriginalString.length()-1;i>=0;i--){
            ReverseString = ReverseString+OriginalString.charAt(i);
        }
        if (OriginalString.equals(ReverseString)){
            System.out.println(OriginalString+" is palindrome.");
        }else {
            System.out.println(OriginalString+" is not palindrome.");

        }
    }
}
