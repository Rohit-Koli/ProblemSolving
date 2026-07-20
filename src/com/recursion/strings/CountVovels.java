package com.recursion.strings;

public class CountVovels {
    public static int vovelsCount(String str,int index,int totalVovels){
        if(index==str.length()){
            return totalVovels;
        }
        if(str.charAt(index)=='a' || str.charAt(index)=='e' || str.charAt(index)=='i' || str.charAt(index)=='o' || str.charAt(index)=='u'){
            return vovelsCount(str,index+1,totalVovels+1);
        }
        return vovelsCount(str,index+1,totalVovels);
    }

    public static void main(String[] args) {
        String name="Rohit";
        System.out.println(vovelsCount(name.toLowerCase(),0,0));
    }
}
