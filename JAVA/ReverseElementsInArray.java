package com.JAVA;

public class ReverseElementsInArray {

    public static void main(String args[])
    {
        int arr[] = {10,20,30,40,50};
        System.out.println("Before reverse elements in array: ");
        for(int i:arr)
        {
            System.out.println(i);
        }

        int first = 0, last = arr.length-1, temp = 0;

        while(first<last)
        {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
        System.out.println("After reverse elements in array: ");
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
