package com.JAVA;
import  java.util.Scanner;

public class Swap_Numbers {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int Number1,Number2,temp;
        System.out.println("Enter Two Numbers: ");
        Number1 = scan.nextInt();
        Number2 = scan.nextInt();

        System.out.println("Before Swapping...");
        System.out.println(Number1);
        System.out.println(Number2);

        temp = Number1;
        Number1 = Number2;
        Number2 = temp;

        System.out.println("After Swapping...");
        System.out.println(Number1);
        System.out.println(Number2);


    }
}
