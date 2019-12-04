package com.example.myapplication;

public class Student {
    String id ;
    String name ;
    String level;
    Float avg;

    public Student(String id, String name, String level, float avg) {
        this.id = id;
        this.level = level;
        this.name = name;
        this.avg = avg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Float getAvg() {
        return avg;
    }

    public void setAvg(Float avg) {
        this.avg = avg;
    }
}
