package com.company.laba10;

public class example_17_5 {
    public static void main(String[] args) {
    try {
        System.out.println("0");            //(1) Выполнение блока try
        throw new RuntimeException("ошибка");

    }catch (NullPointerException e){
        System.out.println("1");            //Блок не выполнится, так как класс для перехвата ошибки не подходящий
    }
    System.out.println("2");                //Из-за возникшей ошибки остальной код не выполнится
}

}
