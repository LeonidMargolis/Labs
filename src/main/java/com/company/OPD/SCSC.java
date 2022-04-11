package com.company.OPD;

import java.util.Scanner;

public class SCSC {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int scheduleBudgeta, curBbudget, percentage, realBudget;
        float schedulemonth, curmMonth, realMonth;

        do {
            System.out.print("Введите плановый бюджет вашего проекта: ");
            while (!scan.hasNextInt()){
                System.out.println("Вы ввели неверное значение");
                System.out.print("Введите целочисленное значение: ");
                scan.next();
            }
            scheduleBudgeta = scan.nextInt();
            if (scheduleBudgeta <= 0){
                System.out.println("Значения 0 и ниже недопустимы");
            }
        } while (scheduleBudgeta <= 0);

        do {
            System.out.print("Введите плановый срок выполнения проекта в месяцах: ");
            while (!scan.hasNextFloat()){
                System.out.println("Вы ввели неверное значение");
                System.out.print("Введите значение типа float: ");
                scan.next();
            }
            schedulemonth = scan.nextFloat();
            if (schedulemonth <= 0) System.out.println("Значения 0 и ниже недопустимы");
        } while (schedulemonth <= 0);

        do{
            System.out.print("Введите текущий израсходованный бюджет: ");
            curBbudget = scan.nextInt();
        } while (curBbudget < 0);

        do{
            System.out.print("Сколько месяцев прошло с момента начала проекта: ");
            curmMonth = scan.nextFloat();
        } while (curmMonth > schedulemonth ||curmMonth <= 0);

        do{
            System.out.print("Сколько процентов проекта завершено (введите значение от 0 до 100): ");
            percentage = scan.nextInt();
        } while (percentage < 0 || percentage > 100);

        realMonth = (100 * curmMonth) / percentage;

        if (realMonth <= schedulemonth){
            System.out.println("Задержки по времени нет");
        }
        else {
            System.out.printf("Задержка по времени составит %.1f мес.", (schedulemonth - schedulemonth));
        }
        System.out.println();
        realBudget = (100 * curBbudget) / percentage;

        if (realBudget <= scheduleBudgeta) System.out.println("Перерасхода нет");
        else System.out.println("Перерасход бюджета " + (realBudget - scheduleBudgeta) + " у. е.");

    }


}
