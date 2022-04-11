package com.company.laba3;

import java.util.Scanner;
public class example_17_2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите день недели:");
        String day = id.nextLine();

        WeekDay.Switch(day);
    }
    static class WeekDay {
        static void Switch(String d) {
            String day = d;
            switch (day) {
                case "понедельник":
                    System.out.println(day + " 1-ый день недели");
                    break;
                case "вторник":
                    System.out.println(day + " 2-ой день недели");
                    break;
                case "среда":
                    System.out.println(day + " 3-ий день недели");
                    break;
                case "четверг":
                    System.out.println(day + " 4-ый день недели");
                    break;
                case "пятница":
                    System.out.println(day + " 5-ый день недели");
                    break;
                case "суббота":
                    System.out.println(day + " 6-ой день недели");
                    break;
                case "воскресенье":
                    System.out.println(day + " 7-ой день недели");
                    break;
                default:
                    System.out.println(day + " некорректное значение дня недели");
                    break;
            }
        }

    }
}