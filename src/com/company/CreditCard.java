package com.company;

public class CreditCard {

    String cardNumber;
    String owner;
    String type;

    public void printInfo() {
        switch (type) {
            case "VISA":
            case "MASTERCARD":
                System.out.println(" Ув. " + owner + " поздравляем, вы используете нормальную карту");
                break;
            case "МИР":
                System.out.println(owner + "пошел ты на х#й вместе со своим русским кораблем!!");
                break;
            default:
                System.out.println("Неизвестный тип карты: " + type);
        }
    }
}
