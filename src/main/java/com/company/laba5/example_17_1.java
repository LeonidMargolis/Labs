package com.company.laba5;

public class example_17_1 {
    public static void main(String[] args) {
        CharF CharF1 = new CharF();
        CharF1.viewCode();

        CharF1.Set('A');
        System.out.println("Char code = " + CharF1.getCodeSymbol()+"\n");

        CharF1.viewCode();
    }
}
