package com.company.laba7;

public class SuperClassExample_17_4 {
    public char charry;
    SuperClassExample_17_4 (char c){
        charry = c;
    }
    SuperClassExample_17_4 (SuperClassExample_17_4 copy){
        charry = copy.charry;

    }
    SuperClassExample_17_4 (){

    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " " + charry;
    }
}
