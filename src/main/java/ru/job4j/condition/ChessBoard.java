package ru.job4j.condition;

/*
Научим слона ходить
 */
public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        /*
        Проверяем валидность входных кординат
         */
        if (isValid(x1) && isValid(y1)
                && isValid(x2) && isValid(y2)) {
            /*
            Проверяем, что фигура ходит как слон
             */
            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                /*
                Если фигура ходит по диагонали - считаем число клеток
                которые фигура проходит и возвращаем его
                 */
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    public static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}
