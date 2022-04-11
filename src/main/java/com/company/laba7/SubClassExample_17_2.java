package com.company.laba7;

public class SubClassExample_17_2 extends SuperClassExample_17_2 {
        public int number;
        private String strSS;
        SubClassExample_17_2(String x, int y){
            number =y;
            strSS = x;
        }
        @Override
        public void setField(){
            strSS = "Undefined";
            number = 0;
        }
        @Override
        public void setField(String x){
            strSS = x;
        }
        public void setField(int y){
            number = y;
        }
        public void setField(String x, int y){
            strSS = x;
            number = y;
        }
        @Override
        public String toString(){
            return number + " " + strSS;
        }


}
