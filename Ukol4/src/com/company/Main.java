package com.company;

public class Main {

    static final String FIZZ = "fizz";
    static final String BUZZ = "buzz";
    static final String FIZZBUZZ = "fizzbuzz";

    public static void fizzBuzzJava() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) System.out.println(FIZZBUZZ);
            else if (i % 3 == 0)  System.out.println(FIZZ);
            else if (i % 5 == 0)  System.out.println(BUZZ);
            else System.out.println(i);
        }
    }

    public static void main(String[] args) {
        fizzBuzzJava();
    }
}
