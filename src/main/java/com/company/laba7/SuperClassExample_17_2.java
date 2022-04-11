package com.company.laba7;

public class SuperClassExample_17_2 {
        private String strS;
        SuperClassExample_17_2(){

        }
        SuperClassExample_17_2(String x){
                strS = x;
        }
        public void setField(){
                strS = "Undefined";
        }
        public void setField(String x) {
                strS = x;
        }
        public int getLenght(){
                return strS.length();
        }

}
