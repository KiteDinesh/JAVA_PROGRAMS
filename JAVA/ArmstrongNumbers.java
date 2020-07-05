package com.JAVA;
import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int Number= scan.nextInt();
        int temp,a=0,c=0;
        temp = Number;
        while (temp>0){
            a = Number%10;
            Number = Number/10;
            c = c+(a*a*a);
        }
        if (temp == c){
            System.out.println("The given number is armstrong number.");
        }else {
            System.out.println("The given number is not armstrong number.");

        }
    }
}
