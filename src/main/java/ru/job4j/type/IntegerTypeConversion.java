package ru.job4j.type;
/*
Практика приведения типов
 */
public class IntegerTypeConversion {
    public static void main(String[] args) {
        int num = 1;
        long numUpper = num;
        short numLower = (short) numUpper;
        System.out.println(numUpper);
        System.out.println(numLower);
    }
}
