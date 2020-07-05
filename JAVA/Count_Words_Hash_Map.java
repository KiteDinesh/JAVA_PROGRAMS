package com.JAVA;
import java.util.HashMap;
import java.util.Scanner;

public class Count_Words_Hash_Map {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = scan.nextLine();

        String[] split = str.split(" ");
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        for (int i=0;i<split.length;i++){
            if (map.containsKey(split[i])){
                int count = map.get(split[i]);
                System.out.println(count);
                map.put(split[i],count+1);
            }
            else {
                map.put(split[i],1);
            }
        }
        System.out.println(map);
    }
}
