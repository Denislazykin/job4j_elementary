package ru.job4j.condition;

/*
Метод принимает число. Необходимо проверить у этого числа следующие условия
и при этом вернуть следующие результаты:
1. Если число делится на 3 без остатка - метод должен вернуть строку Hello;
2. Если число делится на 5 без остатка - метод должен вернуть строку World;
3. Если число делится на 3 и на 5 одновременно без остатка - метод должен вернуть строку Hello, World!!!
4. Если не выполнится ни одно из выше указанных условий - метод должен вернуть строку Operation not support.
 */
public class HelloWorld {
    public static String checkNumber(int number) {
        String action;
        if (number % 3 == 0 && number % 5 == 0) {
            action = "Hello, World!!!";
        } else if (number % 5 == 0) {
            action = "World";
        } else if (number % 3 == 0) {
            action = "Hello";
        } else {
            action = "Operation not support";
        }
        return action;
    }
}
