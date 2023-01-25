package com.AccioAvengers.StudentManagementSystem;

public class Student
{
    private String name;
    private int enrolmentNo;
    private int age;
    private String state;

    public Student(String name, int enrolmentNo, int age, String state)
    {
        this.name = name;
        this.enrolmentNo = enrolmentNo;
        this.age = age;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnrolmentNo() {
        return enrolmentNo;
    }

    public void setEnrolmentNo(int enrolmentNo) {
        this.enrolmentNo = enrolmentNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
