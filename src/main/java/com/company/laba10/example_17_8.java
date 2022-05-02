package com.company.laba10;

public class example_17_8 {
    public static int m(){
        try {
            System.out.println("0");        //(1) Выполнение блока try
            throw new RuntimeException();
        } finally {
            System.out.println("1");        //(2) Выполнение блока finally
        }
    }
    public static void main(String[] args) {
        System.out.println(m());            //Возникнет необработанная ошибка типа RuntimeException
    }

}
