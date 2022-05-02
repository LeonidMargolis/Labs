package com.company.laba10;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class example_17_2_1 {
    static Scanner scanner = new Scanner(System.in);
    static int [][] matrixnums = new int[17][17];

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < matrixnums.length; i++){
            System.out.println();
            for (int k = 0; k < matrixnums.length; k++){
                matrixnums[i][k] = random.nextInt(150);
                System.out.printf("%2d ", matrixnums[i][k]);
            }
        }
        System.out.println();
        System.out.println("Номер столбца для вывода");

        try{
            OutColumn(InColumn());
        } catch (InputMismatchException e){
            System.out.println("Ошибка ввода сроки вместо числа");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Такого столбца не существует");
        }

    }
    private static int InColumn() throws InputMismatchException{
        return scanner.nextInt();
    }
    private static void OutColumn(int column) throws IndexOutOfBoundsException{
        for (int[] numsMatrix : matrixnums) {
            System.out.println(numsMatrix[column]);
        }
    }

}
