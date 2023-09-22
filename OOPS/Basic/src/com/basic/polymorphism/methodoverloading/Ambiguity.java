package com.basic.polymorphism.methodoverloading;

/*
    Name    : Monu KD (monukd01dev)
    Project : Basic
    Date    : 22-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class Ambiguity {

        void sum(int a,long b){System.out.println("a method invoked");}
        void sum(long a,int b){System.out.println("b method invoked");}

        public static void main(String args[]){
            var obj=new Ambiguity();
//            obj.sum(20,20);//now ambiguity
        }

}
