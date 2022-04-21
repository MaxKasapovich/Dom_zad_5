package com.company;

public class CreditCard {

    String cardNumber;
    String owner;
    String type;

    public void printInfo() {
        switch (type) {
            case "VISA":
            case "MASTERCARD":
                System.out.println("Dear " + owner + " congratulations, you are using a normal card");
                break;
            case "МИР":
                System.out.println(owner + " f@ck you and your russian ship!!");
                break;
            default:
                System.out.println("Unknown card type: " + type);
        }
    }
}
