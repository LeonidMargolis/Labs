package com.company.laba7;

public class SubClass1_example_17_5  extends SuperClassExample_17_5{
    protected int number;
    SubClass1_example_17_5(String str, int number){
        this.number=number;
        this.str = str;

    }
    @Override
    public void showClassAndFields(){
        String classAndFields;
        classAndFields = "super" + "\n" + "superClass" + this.getClass().getSimpleName() +
                "\n" + "str =" + str + " " + number;
        System.out.println(classAndFields);
    }
}
