package ru.job4j.loop;

public class Counter {
    /*
    Считает сумму чисел от start до finish
    */
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /*
    Считает сумму четных чисел от start до finish
     */
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    /*
    Вычисляем остаток от деления двух чисел
     */
    public static int modulo(int number, int divider) {
        while (number >= divider) {
            number -= divider;
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(0, 5));
        System.out.println(sumByEven(1, 10));
        System.out.println(modulo(21, 16));
    }
}
