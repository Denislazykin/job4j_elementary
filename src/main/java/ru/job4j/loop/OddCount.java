package ru.job4j.loop;

/*
Даны два целых положительных числа a и b (b > a).
Найти количество нечетных чисел в диапазоне [a, b].
Нечетным считается число, у которого остаток от деления на 2 равен 1
 */
public class OddCount {
    public static int count(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                ++result;
            }
        }
        return result;
    }
}
