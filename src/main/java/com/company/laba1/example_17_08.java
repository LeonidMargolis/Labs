package com.company.laba1;

import java.util.Scanner;
public class example_17_08 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input family: ");
        String family = in.nextLine();
        System.out.print("Input patronymic: ");
        String patronymic = in.nextLine();
        System.out.print("Hello" + ' ' + family + ' ' + name +' ' + patronymic);
        in.close();
    }
}