package com.company.laba10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example_17_3_2 {
    static long sumArray = 0;
    static byte [] byteArray = new byte[5];
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            ByteArrayIn();
            ByteArraySum();
            System.out.println("Сумма элементов массива типа byte = " + sumArray);
        } catch (InputMismatchException e){
            if (!scan.hasNextInt() && !scan.hasNextFloat() && !scan.hasNextLong()
                    && !scan.hasNextShort() && !scan.hasNextDouble()){

                System.out.println("Вы ввели целочисленное значение, а не сторку");
            }
            else System.out.println("Значение ввода находится за пределами границ диапазона byte");
        } catch (ArithmeticException e){
            System.out.println("Значение вычисления находится за пределами границ диапазона byte");
        }
    }
    private static void ByteArrayIn() throws InputMismatchException{
        for (int i = 0; i < byteArray.length; i++) byteArray[i] = scan.nextByte();
    }
    private static void ByteArraySum() throws ArithmeticException{
        for (byte x : byteArray) sumArray += x;
        if (sumArray > 127 || sumArray < -128) throw new ArithmeticException("Привышение границ диапазона типа");
    }

}
