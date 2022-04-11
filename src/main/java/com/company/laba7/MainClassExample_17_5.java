package com.company.laba7;

public class MainClassExample_17_5 {
    public static void main(String[] args) {
        SuperClassExample_17_5 super0 = new SuperClassExample_17_5("Love beleshi");

        SubClass1_example_17_5 sub1 = new SubClass1_example_17_5("Love beleshi s meat v kollihestve", 7);

        SubClass2_example_17_5 sub2 = new SubClass2_example_17_5("Love beleshi s meat ne iz ", '@');

        super0.showClassAndFields();
        sub1.showClassAndFields();
        sub2.showClassAndFields();

        SuperClassExample_17_5 super1;
        super1 = sub2;
        super1.showClassAndFields();

    }
}
