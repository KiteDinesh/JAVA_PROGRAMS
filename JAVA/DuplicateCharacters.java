package com.JAVA;
import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scan.nextLine();
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i =0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    count++;
                    break;
                }
            }
        }

        System.out.println("The number of duplicates in the string: "+count);

    }
}
