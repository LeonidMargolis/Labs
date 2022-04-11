package com.company.laba5;

public class CNumber {
    private int int1;

    public void Set(int n) {
        System.out.println("Метод Set() c аргументом");
        int1 = n;
        if (n >= 100) {
            int1 = 100;
        }
        if (n <= 0) {
            int1 = 0;
        }
    }

    public void Set() {
        System.out.println("Метод Set() без аргумента");
        int1 = 0;
    }

    public void printInt() {
        System.out.println("Число = " + int1);
    }

    CNumber(int int1) {
        System.out.println("CNumber() конструктор");
        this.Set(int1);
    }
}