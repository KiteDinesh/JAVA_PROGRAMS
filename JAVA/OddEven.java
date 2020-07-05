package com.JAVA;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num = obj.nextInt();

        if(num%2 == 0)
        {
            System.out.println(num +"is a even number.");
        }
        else
        {
            System.out.println(num +"is a odd number. ");
        }
    }
}
