package com.company.laba7;

public class MainClassExample_17_4 {
    public static void main(String[] args) {
        SuperClassExample_17_4 superClassObject = new SuperClassExample_17_4('C');
        System.out.println(superClassObject.toString());

        SubClass1_example_17_4 subClass1Object = new SubClass1_example_17_4('C', "Keks");
        System.out.println(subClass1Object.toString());

        SubClass2_example_17_4 subClass2Object = new SubClass2_example_17_4('A', "Vkusny keks", 7);
        System.out.println(subClass2Object.toString());

        SuperClassExample_17_4 superClassObjectCopy = new SuperClassExample_17_4(subClass2Object);
        System.out.println(superClassObjectCopy.toString());


    }
}
