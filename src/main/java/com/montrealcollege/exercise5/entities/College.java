package com.montrealcollege.exercise5.entities;

import java.util.List;

public class College {

    private String name;
    private List<Program> programs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Program> getPrograms() {
        return programs;
    }

    public void setPrograms(List<Program> programs) {
        this.programs = programs;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                ", programs=" + programs +
                '}';
    }
}
