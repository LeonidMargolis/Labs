package com.company.laba4;

    public class example_17_1 {
        public static void main(String[] args) {
            int rows = 11;
            int columns = 23;
            int z;
            for (int i = 1 ; i <= rows; i++){
                System.out.print("номер строки: " + i + " ");
                z = 0;
                for (int j = 1; j <=columns; j++){
                    System.out.print("+");
                    z = z + 1;
                }
                System.out.println(" Количество символов в строке " + z);
            }
        }
    }
