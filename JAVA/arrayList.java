package com.JAVA;
import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("12");
        list.add("24");
        list.add("36");
        list.add("48");
        list.add("60");
        System.out.println("The list size is: "+list.size());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        for (Object obj:list){
            System.out.println(obj);
        }
        System.out.println();
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}