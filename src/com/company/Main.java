package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(sqrt(-6));
    }

    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
        return Math.sqrt(x); // your implementation here
    }

}
