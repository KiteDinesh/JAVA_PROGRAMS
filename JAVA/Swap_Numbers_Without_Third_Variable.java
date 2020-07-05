package com.JAVA;
import java.util.Scanner;

public class Swap_Numbers_Without_Third_Variable {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two Numbers: ");
        int Number1,Number2;
        Number1 = scan.nextInt();
        Number2 = scan.nextInt();

        System.out.println("Enter two numbers: ");
        System.out.println("Before swapping...");
        System.out.println(Number1);
        System.out.println(Number2);

        System.out.println("After swapping...");
        Number1 = Number1+Number2;
        Number2 = Number1-Number2;
        Number1 = Number1-Number2;
        System.out.println(Number1);
        System.out.println(Number2);

    }
}
