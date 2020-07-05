package com.JAVA;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        boolean isPrime = true;
        scan.close();
        for (int i=2;i<=number/2;i++){
            int temp = number%i;
            if (temp == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("The given number is prime number.");
        }else {
            System.out.println("The given number is not prime number.");
        }
    }
}
