package com.hyrtutorials.inheritance;

public class Admin extends Developer{
    //Adding or deleting the prodcts/application
    public void manage(){
        System.out.println("Manage code");
    }
    public void read(){
        System.out.println("Admin read code");
    }
}