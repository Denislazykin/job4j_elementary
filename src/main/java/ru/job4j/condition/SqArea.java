package ru.job4j.condition;

public class SqArea {
    /*
    Метод расчитывает площадь прямоугольника,
    если известны периметр и соотношение сторон
     */
    public static double square(double p, double k) {
        double height = p / (2 * (k + 1));
        double length = height * k;
        return length * height;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}
