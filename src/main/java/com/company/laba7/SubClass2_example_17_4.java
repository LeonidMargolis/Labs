package com.company.laba7;

public class SubClass2_example_17_4 extends SubClass1_example_17_4{
    public int number;
    SubClass2_example_17_4(char c, String str, int number){
        this.number = number;
        this.str = str;
        charry = c;
    }
    SubClass2_example_17_4(SubClass2_example_17_4 copy){
        this.str = copy.str;
        this.charry = copy.charry;
        this.number = copy.number;

    }
    SubClass2_example_17_4(){

    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " " + charry + " " + str + " " + number;
    }
}
