package com.company;

public class Part1 {

    public void printInfo() {
        for (int i = 0; i < 100; i++) {
            if (i == 13 || i == 66) {
             continue;
            }
            System.out.println("Cycle100: " + i);
        }
    }
}
