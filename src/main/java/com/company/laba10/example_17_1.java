package com.company.laba10;

public class example_17_1 {
    public static void main(String[] args) {
        try{
            System.out.println("0");         //(1) Выполнение блока try
            throw new RuntimeException("Непроверямемая ошибка"); //создан экземпляр RuntimeException с сообщением
        }catch (RuntimeException e){           //исключение перехвачено
            System.out.println("1 " + e);    //(2) Выполнение блока catch,  исключение обработано
        }
        System.out.println("2");             //(3) Выполнение остального кода
    }
}

