package com.company.laba7;

public class SuperClassExample_17_5 {

    protected String str;

    SuperClassExample_17_5(String str){
        this.str = str;
    }

    public void showClassAndFields(){
        String classAndFields;
        classAndFields = "super" + "\n" + "superClass" + this.getClass().getSimpleName() + "\n" + "str =" + str;
        System.out.println(classAndFields);
    }
    SuperClassExample_17_5(){

    }

}
