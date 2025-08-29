package com.uob;

public class Calculator {
    public int divide(int a, int b) {
        try {
            return a / 0;
        } catch (Exception e) { // empty catch block
        }
        return 0;
    }
}
