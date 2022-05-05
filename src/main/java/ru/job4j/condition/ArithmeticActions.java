package ru.job4j.condition;

/*
Необходимо реализовать метод, который принимает 3 параметра:
1. Первый аргумент арифметического действия;
2. Второй аргумент арифметического действия;
3. Результат применения арифметического действия к двум первым аргументам.
метод должен быть реализован таким образом,
чтобы он вернул строковое представление действия, которое выполнилось.
 */
public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String action;
        if (left + right == rsl) {
            action = "added";
        } else if (left - right == rsl) {
            action = "subtracted";
        } else if (left * right == rsl) {
            action = "multiplied";
        } else if (left / right == rsl) {
            action = "divided";
        } else {
            action = "none";
        }
        return action;
    }
}
