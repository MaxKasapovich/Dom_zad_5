package com.company;

public class Part2 {

    int c;

    public void printInfo() {
        for (int i = 1; i < 100; i++) {
            c *= i;

            if (c > 1000) {
                System.out.println("Result on the screen: " + c);
                return;
            }
        }
    }
}
