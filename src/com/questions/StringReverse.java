package com.questions;

public class StringReverse {
    public static String revSTring(String str){
        return new StringBuffer(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(revSTring("Hello"));
    }
}
