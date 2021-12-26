import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int balance = 52; // баланс счёта
        int refill = 1000; // сумма пополнения
        int refillBonus = refill / balance; // кол-во бонусов за внесённую сумму
        int balancePlusBonus = refillBonus + refill + balance; // баланс после пополнения с бонусами
        int refillNoBonus = balance + refill; // баланс после пополнения без бонусов

        if (refill > 1000) {
            System.out.println("Ваш баланс " + balancePlusBonus);
        } else {
            System.out.println("Ваш баланс " + refillNoBonus);

        }

    }
}