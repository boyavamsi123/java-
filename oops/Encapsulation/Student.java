package com.vamsi.encapsulation;

public class Student{
    private int rollNumber;
    private String name;
    private Boolean isAttended;

    public Student(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        System.out.println("student number is accessed");
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        System.out.println("student name is vamsi");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsAttended() {
        System.out.println("student attendence is successed");
        return isAttended;
    }

    public void setIsAttended(Boolean isAttended) {
        this.isAttended = isAttended;
    }
}