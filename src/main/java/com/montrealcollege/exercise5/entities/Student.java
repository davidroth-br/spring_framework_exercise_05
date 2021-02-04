package com.montrealcollege.exercise5.entities;

public class Student {

    private String firstName;
    private String lastName;
    private Program javaProgram;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Program getJavaProgram() {
        return javaProgram;
    }

    public void setJavaProgram(Program javaProgram) {
        this.javaProgram = javaProgram;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", javaProgram=" + javaProgram +
                '}';
    }
}
