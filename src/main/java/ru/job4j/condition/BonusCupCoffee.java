package ru.job4j.condition;

/*
Возьми определенное количество чашек кофе,
отметь это на специальном бланке и
следующую чашку ты получишь бесплатно.
 */
public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        return count / n + count;
    }
}
