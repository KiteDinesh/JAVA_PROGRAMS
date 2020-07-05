package com.JAVA;

public class Sample {
    public static void main(String  args[]){
        int[][][] test = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };
        for(int[][] array3d : test){
            for (int[] array2d : array3d){
                for (int data : array2d){
                    System.out.println(data);
                }
            }
        }
    }
}
