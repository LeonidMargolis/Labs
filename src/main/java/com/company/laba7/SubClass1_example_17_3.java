package com.company.laba7;

public class SubClass1_example_17_3 extends SuperClassExample_17_3 {
    public char symbol;
    SubClass1_example_17_3(){

    }
    SubClass1_example_17_3(int x, char simba){
        number = x;
        symbol = simba;
    }
    public void setField(int x, char simba) {
        number = x;
        symbol = simba;
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " " + number + " " + symbol;
    }

}
