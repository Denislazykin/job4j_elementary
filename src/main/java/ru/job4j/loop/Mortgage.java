package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount >= salary) {
            double sum = amount * percent;
            year++;
        }
        return year;
    }
}
