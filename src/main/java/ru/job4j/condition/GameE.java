package ru.job4j.condition;

public class GameE {
    public static int checkGameE(double percent, int prize, int pay) {
        int sum = (int) (percent * prize);
        if (sum > pay) {
            return (int) (sum - pay);
        }
        return 0;
    }
}
