package com.uob;

public class Calculator {
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("exception")
        }
        return 0;
    }
}
