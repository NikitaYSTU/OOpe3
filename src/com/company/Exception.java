package com.company;

public class Exception extends Throwable {

    private final int lower;

    public Exception(int lower) {
        this.lower = lower;
    }

    public int getLower() {
        return lower;
    }
}