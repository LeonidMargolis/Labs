package com.company.laba3;

public class example_17_8 {
    public static void main(String[] args) {
        final int literA = 65;

        char[] targetArray = new char[10];
        char[] not = new char[] {'A', 'E', 'I'};

        for (int count = 0, i = 0; count < 10; i++) {
            char liter = (char) (literA + 1);

            if ( ! isContain(not, liter)) {
                targetArray[count] = liter;
                count++;
            }
        }

        System.out.println("Список первые 10 соласных");

        for (char x:targetArray) {
            System.out.println(x);
        }
    }
    public static boolean isContain(char[] string, char liter)
    {
        for(char x:string) {
            if(liter == x){
                return true;
            }
        }
        return false;
    }
}
