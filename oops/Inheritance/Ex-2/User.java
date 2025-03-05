package com.hyrtutorials.inheritance;

public class User{
    public static void main(String[] args) {
        BasicCalc B1 = new BasicCalc();
        B1.Arithematic();
        System.out.println("============================");
        AdvCalc A1 = new AdvCalc();
        A1.Arithematic();
        A1.modulos();
        System.out.println("============================");
        LogCalc L1 = new LogCalc();
        L1.Arithematic();
        L1.modulos();
        L1.log();
        System.out.println("=============================");
        ScientificCalc S1 = new ScientificCalc();
        S1.Arithematic();
        S1.modulos();
        S1.log();
        S1.Scientific();
    }
}