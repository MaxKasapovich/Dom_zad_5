package com.company;

public class Main {

    public static void main(String[] args) {
        Part1 part1 = new Part1();
        part1.printInfo();

        Part2 part2 = new Part2();
        part2.c = 1;
        part2.printInfo();

        CreditCard creditCard1 = new CreditCard();

        creditCard1.cardNumber = "4646 7867 7868 6787";
        creditCard1.owner = "Elon Musk";
        creditCard1.type = "VISA";
        creditCard1.printInfo();

        CreditCard creditCard2 = new CreditCard();
        creditCard2.cardNumber = "4886 6567 000 6787";
        creditCard2.owner = "Boris Johnson";
        creditCard2.type = "MASTERCARD";
        creditCard2.printInfo();

        CreditCard creditCard3 = new CreditCard();
        creditCard3.cardNumber = "4226 6557 0006 6787";
        creditCard3.owner = "П@здун Песков";
        creditCard3.type = "МИР";
        creditCard3.printInfo();
    }
}
