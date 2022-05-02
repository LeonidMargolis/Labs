package com.company.laba10;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class example_17_2_2 {
    public static void main(String[] args) {

        int [][] matrixnums = new int [7][7];
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.println();
            for (int k = 0; k < 5; k++){
                matrixnums[i][k] = random.nextInt(100);
                System.out.printf("%2d ", matrixnums[i][k]);
            }
        }
        System.out.println();
        System.out.println("Введите номер столбца для вывода");
        try {
            int column = scan.nextInt();

            for (int i = 0; i < 5; i++) {
                System.out.println(matrixnums[i][column]);
            }
        } catch (InputMismatchException e){
            System.out.println("Вы ввели целочисленное значение, а не сторку");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Такого столбца не существует");
        }
    }
}
