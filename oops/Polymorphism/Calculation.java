package com.vamsi.polymorphism;
public class Calculation{
    public void add(int a,int b){
        // add method code
    }

    public void add(double a,double b){
        // add method code
    }

    public static void main(String[] args) {
        Calculation c = new Calculation();
        c.add(1, 2);
        c.add(2, 3);
    }
}