package com.travis;

public class Student implements IPerson {
    private int id;
    private String name;
    T data;

    public Student(String name, int id, T data){
        this.id = id;
        this.name = name;
        this.data = data;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getID() {
        return 0;
    }
}
