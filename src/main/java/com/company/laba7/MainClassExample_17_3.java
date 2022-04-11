package com.company.laba7;

public class MainClassExample_17_3 {
    public static void main(String[] args) {
        SuperClassExample_17_3 superClassExample_17_3 = new SuperClassExample_17_3(7);
        System.out.println(superClassExample_17_3.toString());

        SubClass1_example_17_3 subClass1_example_17_3 = new SubClass1_example_17_3(5,'!');
        System.out.println(subClass1_example_17_3.toString());

        SubClass2_example_17_3 subClass2_example_17_3 = new SubClass2_example_17_3(6, '@', "simbabot" );
        System.out.println(subClass2_example_17_3.toString());
    }
}
