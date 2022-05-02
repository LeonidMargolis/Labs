package com.company.laba10;

import java.util.InputMismatchException;
import java.util.Scanner;


public class example_17_3_1 {
    public static void main(String[] args) {

    long sumArray = 0;
    byte [] byteArray = new byte[5];
    Scanner scan = new Scanner(System.in);

    try{
        for (int i = 0; i < byteArray.length; i++) {
            byteArray[i] = scan.nextByte();
            sumArray += byteArray[i];

            if (sumArray > 127 || sumArray < -128) throw new ArithmeticException("Привышение границ диапазона типа");
        }

        System.out.println("Сумма элементов массива типа byte = " + (byte) sumArray);

    } catch (ArithmeticException e){
        System.out.println("Значение ввода или вычесления находится за пределами границ диапазона byte");
    } catch (InputMismatchException e){
        System.out.println("Вы ввели целочисленное значение, а не сторку");
    }
}

}
