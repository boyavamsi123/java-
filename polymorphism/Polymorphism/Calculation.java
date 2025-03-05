package com.polymorphism;

public class Calculation{
    public void add(int a, int b){
        //add method code 
    }
    
    public void add(int a, int b, int c){
        //add method code 
    }

    public static void main(String[] args) {
        Calculation c = new Calculation();
        c.add(10, 20);
        c.add(10, 20, 30);
        System.out.println();
    }
}