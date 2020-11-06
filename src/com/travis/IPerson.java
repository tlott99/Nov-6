package com.travis;

public interface IPerson<T> {
    String getName();
    int getID();
    T data ;
}
