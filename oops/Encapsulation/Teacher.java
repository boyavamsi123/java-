package com.vamsi.encapsulation;

public class Teacher{
    public static void main(String[] args) {
        Student s = new Student(101);
        s.setIsAttended(true);
        s.getIsAttended();
        s.setRollNumber(101);
        s.getRollNumber();
        s.setName("vamsi");
        s.getRollNumber();
    }
}