package com.JAVA;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class HashMapPrograms {
    public static void main(String args[]){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Welcome",1);
        map.put("To",2);
        map.put("JAVA",3);
        map.put("Programs",4);
        System.out.println(map.size());
        Iterator itr = map.entrySet().iterator();
        for (Map.Entry data:map.entrySet()){
            System.out.println(data.getKey()+" "+data.getValue());
        }
    }
}
