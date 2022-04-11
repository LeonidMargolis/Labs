package com.company.laba7;

public class MainExample_17_2 {
    public static void main(String[] args) {
        SuperClassExample_17_2 superClassObject = new SuperClassExample_17_2("передал в конструктор суперкласса");
        int strL = superClassObject.getLenght();
        System.out.println(strL);

        SubClassExample_17_2 subClassObject = new SubClassExample_17_2("передал в конструктор подкласса", 7);
        String strX = subClassObject.toString();
        System.out.println(strX);
    }
}
