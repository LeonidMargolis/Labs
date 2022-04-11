package com.company.laba9;

import java.sql.SQLOutput;
import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class example_17_1 {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        Map<Integer, Integer> HashMap = new HashMap<>();
        Map<Integer, Integer> TreeMap = new TreeMap<>();

        System.out.println("Заполним каждую из коллекций 17 000 000 элемнтами");
        fillCollection(arrayList, 17000000);
        fillCollection(HashMap, 17000000);
        fillCollection(TreeMap, 17000000);

        System.out.println("Добавление элемента в начало, середину и конец коллекции ");
        System.out.println("Время добавление эллемента в коллекции Hashmap не меняется");
        System.out.println("Для любого добавления элемента в Hashmap время выполнения операции будет равно: " + getRunningTimeAdd(HashMap));
        System.out.println("Время на добавление элемента в коллекцию TreeMap не будет меняться");
        System.out.println("Для любого добавления элемента в Hashmap время выполнения операции будет равно: " + getRunningTimeAdd(TreeMap));
        System.out.println("Время выполнения оперция добавления элемента для ArrayList" + " в конец, в середину и в начало коллекции " + getRunningTimeAdd(arrayList));
        System.out.println();
        System.out.println("Удаляем из начала, середины в конце каждой коллекции элемнт");
        System.out.println("Время на удаление элемнта в коллекции Hashmap не будет меняеться");
        System.out.println("Для любого удаления в Hashmap время выполнения операции будет равно: " + runningTineRemove(HashMap));
        System.out.println("Время на удаление элемнта в коллекции TreeMap не будет меняеться");
        System.out.println("Для любого удаления в Hashmap время выполнения операции будет равно: " + runningTineRemove(TreeMap));
        System.out.println("Время выполнения оперция удаления элемента для ArrayList" + " в конец, в середину и в начало коллекции " + getRunningTimeRemove( arrayList));
        System.out.println();
        System.out.println("Очищения списков");
        HashMap.clear();
        TreeMap.clear();
        arrayList.clear();
        System.out.println();

        System.out.println("Заполним каждую из коллекций 17 000 000 элемнтами");
        fillCollection(arrayList, 10000000);
        fillCollection(HashMap, 10000000);
        fillCollection(TreeMap, 10000000);

        System.out.println("Получим элемент у каждой коллекции, который находится под 5 000 000 000");
        System.out.println("Для HashMap время получения элемента будет равно " + runningTimeElenGet(HashMap));
        System.out.println("Для TreeMap время получения элемента будет равно " + runningTimeElenGet(TreeMap));
        System.out.println("Для ArrayList время получения элемента будет равно " + runningTimeElenGet(arrayList));
    }

    private static void fillCollection(List<Integer> arrayList, long length) {
        for (int i = 0; i < length; i++) {
            arrayList.add(i);
        }
    }

    private static void fillCollection(Map<Integer, Integer> Map, long length) {
        for (int i = 0; i < length; i++) {
            Map.put(i, i);
        }
    }

    public static long getRunningTimeAdd(Map<Integer, Integer> hashmap) {
        long start = System.currentTimeMillis();
        hashmap.put(-1, -1);
        long end = System.currentTimeMillis();

        return end - start;
    }
    public static String getRunningTimeAdd (List<Integer> arrayList){
        long tine1, tine2, tine3, start, end;
        start = System.currentTimeMillis();
        arrayList.add(0,0);
        end = System.currentTimeMillis();

        tine1 = end -start;

        start = System.currentTimeMillis();
        arrayList.add(8500000,0);
        end = System.currentTimeMillis();

        tine2 = end - start;

        start = System.currentTimeMillis();
        arrayList.add(17000000);
        end = System.currentTimeMillis();

        tine3 = end - start;

        return tine1 + " " + tine2 + " " + tine3;
    }
    private static long runningTineRemove(Map<Integer,Integer> hashmap){
        long start, end;

        start = System.currentTimeMillis();
        hashmap.remove(7500000);
        end = System.currentTimeMillis();

        return  end - start;
    }
    public static String getRunningTimeRemove (List<Integer> arrayList){
        long tine1, tine2, tine3, start, end;
        start = System.currentTimeMillis();
        arrayList.remove(0);
        end = System.currentTimeMillis();

        tine1 = end -start;

        start = System.currentTimeMillis();
        arrayList.remove(17000000);
        end = System.currentTimeMillis();

        tine2 = end - start;

        start = System.currentTimeMillis();
        arrayList.remove(17000000);
        end = System.currentTimeMillis();

        tine3 = end - start;

        return tine1 + " " + tine2 + " " + tine3;
    }
    private static long runningTimeElenGet (Map<Integer, Integer> hashmap){
        long start, end;

        start = System.currentTimeMillis();
        hashmap.get(7000000);
        end = System.currentTimeMillis();

        return  end - start;
    }
    private static long runningTimeElenGet (List<Integer> arrayList){
        long start, end;

        start = System.currentTimeMillis();
        arrayList.get(7000000);
        end = System.currentTimeMillis();

        return end -start;
    }
}


