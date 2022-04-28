package ru.job4j.type;

import java.util.Scanner;
/*
ѕрограмма получает от пользовател€ число в диапазоне short и выводит его на консоль.


 */
public class ShortType {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short value = in.nextShort();
        System.out.println(value);
    }
}