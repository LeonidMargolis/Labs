package com.company.Timus;



public class ObratnieKorn {
    public static void main(String[] args) {
        for(int i = args.length -1; i >= 0; --i ) {
            System.out.printf("%.4f\n", Math.sqrt(Float.parseFloat(args[i])));
        }
    }
}
