package ru.job4j.type;

import java.util.Scanner;

/*
ѕрограмма получает от пользовател€ число в диапазоне int и выводит его на консоль.
 */
public class IntType {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        System.out.println(value);
    }
}
