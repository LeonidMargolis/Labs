package com.company.laba7;

public class SubClass2_example_17_5 extends SuperClassExample_17_5{
    protected char cherry;
    SubClass2_example_17_5(String str, char cherry){
        this.str = str;
        this.cherry=cherry;
    }
    @Override
    public void showClassAndFields(){
        String classAndFields;
        classAndFields = "super" + "\n" + "superClass" + this.getClass().getSimpleName() +
                "\n" + "str =" + str + " " + cherry;
        System.out.println(classAndFields);
    }
}
