package com.JAVA;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        int a=0,b=0,c=1;
        for (int i=0;i<number;i++){
            a = b;
            b = c;
            c = a+b;
            System.out.println(a);
        }
    }
}
