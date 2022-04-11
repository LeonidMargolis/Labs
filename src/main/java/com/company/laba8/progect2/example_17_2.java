package com.company.laba8.progect2;

public class example_17_2 {
    public static void main(String[] args) {
    int x = 0;
    n(x);
        System.out.println(n(x));
    }
    public static String n(int x){
        if (x==1){
            return "1";
        } else if (x==0){
            return "0";
        } else {

            return n(x / 2)+ x % 2;
        }
    }
}



