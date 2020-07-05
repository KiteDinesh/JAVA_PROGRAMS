package com.JAVA;

public class SecondLargest {
    public static void main(String args[]){
        int arr[] = { 100,14, 46, 47, 94, 94, 152, 86, 36, 99, 89 };
        int Largest = 0,SecondLargest = 0;

        for (int i=0;i<arr.length;i++){
                if (arr[i]>Largest){
                    Largest = arr[i];

                }else if (arr[i] > SecondLargest)
                {
                    SecondLargest = arr[i];
                }



        }
        System.out.println(Largest);
        System.out.println(SecondLargest);



    }

}
