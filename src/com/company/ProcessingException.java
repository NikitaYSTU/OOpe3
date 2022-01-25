package com.company;

public class ProcessingException extends Exception {

    private final int lower;

    public ProcessingException(int lower) {
        this.lower = lower;
    }

    public int getLower() {
        return lower;
    }
}