package ru.job4j.condition;

/*
 Найти день недели в зависимости от
 его порядкового номера
 */
public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "СУббота";
                break;
            case 7:
                name = "Воскресеьне";
                break;
            default:
                name = "Ошибка";
        }
        return name;
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(2));
    }
}
