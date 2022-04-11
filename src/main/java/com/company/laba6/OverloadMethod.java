package com.company.laba6;

class OverloadMethod {
     String str;
     char chr;
     public void set(String str){
         this.str = str;
     }
     public void set(char chr){
         this.chr = chr;
     }
     public void set(char... chr_m){
         if (chr_m.length == 1) this.chr=chr_m[0];
         else if (chr_m.length > 1) str=new String(chr_m);

     }
     public void get(){
         System.out.println(str + " " + chr);
     }
    }
