package com.hyrtutorials.inheritance;

public class User{
    public static void main(String[] args) {
        TwoG fG = new TwoG();
        fG.calling();
        fG.sms();
        System.out.println("=================================");
        ThreeG SG = new ThreeG();
        SG.calling();
        SG.sms();
        SG.gprs();
        System.out.println("=================================");
        FourG TG = new FourG();
        TG.calling();
        TG.sms();
        TG.gprs();
        TG.volte();
        TG.Hplus();
        System.out.println("=================================");
        FiveG FG = new FiveG();
        FG.calling();
        FG.sms();
        FG.gprs();
        FG.volte();
        FG.Hplus();
        FG.FiveGplus();
    }
}