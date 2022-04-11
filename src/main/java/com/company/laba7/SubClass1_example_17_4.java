package com.company.laba7;

public class SubClass1_example_17_4 extends SuperClassExample_17_4 {
    public String str;
    SubClass1_example_17_4(char c, String str){
        this.str = str;
        charry = c;
    }
    SubClass1_example_17_4(SubClass1_example_17_4 copy){
        this.str = copy.str;
        this.charry = copy.charry;
    }
    SubClass1_example_17_4(){

    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " " + charry + " " + str;
    }
}
