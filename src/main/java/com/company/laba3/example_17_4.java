package com.company.laba3;

    import java.util.Scanner;

    public class example_17_4 {
        public static void main(String[] args) {
            Scanner id = new Scanner(System.in);
            System.out.println("Ввведите первое число");
            int x = id.nextInt();
            System.out.println("Ввведите второе число");
            int y = id.nextInt();

            SortNums.SortNums(x, y);
        }

        static class SortNums {
            static void SortNums(int x, int y) {
                if (x > y) {
                    while (y <= x) {
                        System.out.printf("%d, ", y);
                        y++;
                    }
                }
                else {
                    while (x <= y) {
                        System.out.printf("%d, ", x);
                        x++;
                    }
                }
                System.out.println("конец числового ряда");
            }

        }
    }

