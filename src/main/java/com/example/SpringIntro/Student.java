package com.example.SpringIntro;

public class Student {
    String firstname;
    String lastname;
    Grade grade;

    public Student() {
    }

    public Student(String firstname, String lastname, Grade grade) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.grade = grade;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
