package com.JAVA;

public class Reverse_String_Without_Inbuild_Function {
    public static void main(String args[]) {
        String str = "Welcome";
        char chars[] = str.toCharArray();
        for (int i = chars.length - 1; i >=0; i--) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }
}
